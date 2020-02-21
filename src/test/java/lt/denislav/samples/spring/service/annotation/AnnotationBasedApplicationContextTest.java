package lt.denislav.samples.spring.service.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedApplicationContextTest {

	@Test
	public void shouldLoadContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

		AnnotationBasedPersonsService personsService = (AnnotationBasedPersonsService) context.getBean("annotationBasedPersonsService");

		System.err.println(personsService);
		System.err.println(personsService.getGenderService());
	}

}
