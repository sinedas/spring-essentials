package lt.denislav.samples.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.AliasFor;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "lt.denislav.samples.spring.service")
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Bean
	public String version() {
		return "1";
	};

	@Value("${application.name}")
	private String applicationName;

	@Bean("adminEmails")
	public List<String> adminEmails() {
		return List.of("admin@gmail.com", "user@gmail.com");
	}

	@Bean
	public DataSources primaryDataSources() {
		return new DataSources(List.of("VMI", "Spies ministry"));
	};


	@Bean
	public DataSources secondaryDataSources() {
		return new DataSources(List.of("FBA", "KGB"));
	};

	@Bean
	@Profile("!dev")
	public ConfigurationService configurationService(String version, List<String> adminEmails, DataSources primaryDataSources, DataSources secondaryDataSources) {
		ConfigurationService configurationService =  new ConfigurationService();
		configurationService.setApplicatioName(applicationName);
		configurationService.setVersion(version);
		configurationService.setAdminEmails(adminEmails);
		configurationService.setPrimaryDataSources(primaryDataSources);
		configurationService.setSecondaryDataSources(secondaryDataSources);
		return configurationService;
	};

	@Bean("configurationService")
	@Profile("dev")
	public ConfigurationService configurationServiceDev(String version, List<String> adminEmails, DataSources primaryDataSources, DataSources secondaryDataSources) {
		ConfigurationService configurationService =  new ConfigurationService();
		configurationService.setApplicatioName(applicationName);
		configurationService.setVersion("dev version");
		configurationService.setAdminEmails(List.of("dev@gmail.com"));
		configurationService.setPrimaryDataSources(primaryDataSources);
		configurationService.setSecondaryDataSources(secondaryDataSources);
		return configurationService;
	};


}
