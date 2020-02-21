package lt.denislav.samples.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class PersonsService implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	private PersonsDao personsDao;

	//@Autowired(required = false)
	@Autowired
	private GenderService genderService;

	public PersonsService(PersonsDao personsDao) {
		this.personsDao = personsDao;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public PersonsDao getPersonsDao() {
		return personsDao;
	}


	public GenderService getGenderService() {
		return genderService;
	}


	public void setGenderService(GenderService genderService) {
		this.genderService = genderService;
	}

}
