package lt.denislav.samples.spring.service.xml;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class XmlBasedApplicationContextTest {
	@Test
	public void shouldLoadContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		System.err.println(context.getBean("personsDao"));
	}

	@Test
	public void beanNames() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		System.err.println(context.getBean("personsService"));
		System.err.println(context.getBean("personsService2"));
		System.err.println(context.getBean("personsService3"));
		System.err.println(context.getBean("personsService4"));
	}

	@Test
	public void beanFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		System.err.println(context.getBean("personsService5"));
	}

	@Test
	public void dependenciesInjection() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		XmlBasedPersonsService personsService = (XmlBasedPersonsService) context.getBean("personsService");
		System.err.println(personsService.getPersonsDao());
		System.err.println(personsService.getGenderService());
	}

	@Test
	public void autowired() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		XmlBasedPersonsService personsService = (XmlBasedPersonsService) context.getBean("autowiredPersonsService");
		System.err.println(personsService.getPersonsDao());
		System.err.println(personsService.getGenderService());
	}

	@Test
	public void beanScopes() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		System.err.println(context.getBean("personsService"));
		System.err.println(context.getBean("personsService"));
		System.err.println(context.getBean("personsPrototypeService"));
		System.err.println(context.getBean("personsPrototypeService"));

		XmlBasedPersonsService personsPrototypeService1 = (XmlBasedPersonsService) context.getBean("personsPrototypeService");
		System.err.println(personsPrototypeService1.getPersonsDao());

		XmlBasedPersonsService personsPrototypeService2 = (XmlBasedPersonsService) context.getBean("personsPrototypeService");
		System.err.println(personsPrototypeService2.getPersonsDao());
	}

	@Test
	public void shouldLoadLazyBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

		System.err.println("context loaded");
		System.err.println(context.getBean("lazyBean"));
	}


}
