package lt.denislav.samples.spring.service.annotation;

import lt.denislav.samples.spring.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationBasedPersonsService {

	@Autowired
	private GenderService genderService;

	public GenderService getGenderService() {
		return genderService;
	}

	public void setGenderService(GenderService genderService) {
		this.genderService = genderService;
	}

}
