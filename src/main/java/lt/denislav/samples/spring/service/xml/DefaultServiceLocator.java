package lt.denislav.samples.spring.service.xml;

import lt.denislav.samples.spring.service.xml.XmlBasedPersonsService;

public class DefaultServiceLocator {
	private static XmlBasedPersonsService personsService = new XmlBasedPersonsService();

	public XmlBasedPersonsService createPersonServiceInstance() {
		return personsService;
	}
}

