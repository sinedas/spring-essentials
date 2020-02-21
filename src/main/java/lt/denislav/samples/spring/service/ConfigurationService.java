package lt.denislav.samples.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ConfigurationService {
	private String version;

	private DataSources primaryDataSources;

	private DataSources secondaryDataSources;

	private List<String> adminEmails;

	private String applicatioName;

	public String getApplicatioName() {
		return applicatioName;
	}

	public void setApplicatioName(String applicatioName) {
		this.applicatioName = applicatioName;
	}

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
				"applicatioName='" + applicatioName + '\'' +
				", version='" + version + '\'' +
				", primaryDataSources=" + primaryDataSources +
				", secondaryDataSources=" + secondaryDataSources +
				", adminEmails" + adminEmails +
				'}';
	}
}
