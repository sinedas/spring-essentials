package lt.denislav.samples.spring.service.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedApplicationConfigurationTest {

	@Test
	public void shouldLoadContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		System.err.println(context.getBean("configurationService"));
	}
}
