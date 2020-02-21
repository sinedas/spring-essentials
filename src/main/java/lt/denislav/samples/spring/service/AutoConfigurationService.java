package lt.denislav.samples.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoConfigurationService implements ApplicationContextAware {

	@Autowired
	private String version;

	@Autowired
	private DataSources primaryDataSources;

	@Autowired
	private DataSources secondaryDataSources;

	@Autowired
	@Qualifier("adminEmails")
	private List<String> adminEmails;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public DataSources getPrimaryDataSources() {
		return primaryDataSources;
	}

	public void setPrimaryDataSources(DataSources primaryDataSources) {
		this.primaryDataSources = primaryDataSources;
	}

	public DataSources getSecondaryDataSources() {
		return secondaryDataSources;
	}

	public void setSecondaryDataSources(DataSources secondaryDataSources) {
		this.secondaryDataSources = secondaryDataSources;
	}

	public List<String> getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(List<String> adminEmails) {
		this.adminEmails = adminEmails;
	}

	@Override
	public String toString() {
		return "ConfigurationService{" +
				"version='" + version + '\'' +
				", primaryDataSources=" + primaryDataSources +
				", secondaryDataSources=" + secondaryDataSources +
				", adminEmails" + adminEmails +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//System.err.println("setApplicationContext for auto configuration:" + applicationContext.getBean("lifeCycleBean"));
	}
}

