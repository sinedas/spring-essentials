package lt.denislav.samples.spring.service;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationBasedApplicationContextTest {

	@Test
	public void shouldLoadContext() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		PersonsService personsService = (PersonsService) context.getBean("personsService");

		System.err.println(personsService);
		System.err.println(personsService.getPersonsDao());
		System.err.println(personsService.getGenderService());
	}

	@Test
	public void shouldLoadAnnotedConfiguration() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		AutoConfigurationService configurationService = (AutoConfigurationService) context.getBean("autoConfigurationService");

		System.err.println(configurationService);
	}

	@Test
	public void shouldLoadConfiguredAnnotatedBean() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		ConfigurationService configurationService = (ConfigurationService) context.getBean("configurationService");

		System.err.println(configurationService);
	}

	@Test
	public void shouldLoadBeanAnnotatedBeanForDevProfile() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(AppConfig.class);
		context.refresh();

		ConfigurationService configurationService = (ConfigurationService) context.getBean("configurationService");

		System.err.println(configurationService);
	}
}
