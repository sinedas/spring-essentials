package lt.denislav.samples.spring.service.xml;

import java.util.List;
import java.util.Map;

public class XmlBasedConfigurationService {

	private String version;

	private List<String> dataSources;

	private Map<String, String> adminEmails;

	public XmlBasedConfigurationService(String version) {
		this.version = version;
	}

	public List<String> getDataSources() {
		return dataSources;
	}

	public void setDataSources(List<String> dataSources) {
		this.dataSources = dataSources;
	}

	public Map<String, String> getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Map<String, String> adminEmails) {
		this.adminEmails = adminEmails;
	}


	@Override
	public String toString() {
		return "XmlBasedConfigurationService{" +
				"version='" + version + '\'' +
				", primaryDataSources=" + dataSources +
				", adminEmails=" + adminEmails +
				'}';
	}
}
