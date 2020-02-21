package lt.denislav.samples.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScannedApplicationContextTest {

	@Test
	public void shouldLoadContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("scan.xml");

		PersonsService personsService = (PersonsService) context.getBean("personsService");

		System.err.println(personsService);
		System.err.println(personsService.getPersonsDao());
		System.err.println(personsService.getGenderService());
	}

}
