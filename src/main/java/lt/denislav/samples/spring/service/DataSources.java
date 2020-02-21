package lt.denislav.samples.spring.service;

import java.util.List;

public class DataSources {
	private List<String> dataSources;

	public DataSources(List<String> dataSources) {
		this.dataSources = dataSources;
	}


	@Override
	public String toString() {
		return "DataSources{" +
				"primaryDataSources=" + dataSources +
				'}';
	}
}
