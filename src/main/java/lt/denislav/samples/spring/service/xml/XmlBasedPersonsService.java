package lt.denislav.samples.spring.service.xml;

import lt.denislav.samples.spring.domain.Person;
import lt.denislav.samples.spring.service.GenderService;
import lt.denislav.samples.spring.service.PersonsDao;

import java.util.List;

public class XmlBasedPersonsService  {

	private PersonsDao personsDao;

	private GenderService genderService;

	public XmlBasedPersonsService() {

	}

	public XmlBasedPersonsService(PersonsDao personsDao) {
		this.personsDao = personsDao;
	}

	public XmlBasedPersonsService(PersonsDao personsDao, GenderService genderService) {
		this.personsDao = personsDao;
		this.genderService = genderService;
	}


	public Person savePerson(Person person) {
		person.setGender(genderService.getGender(person.getCode()));
		return personsDao.save(person);
	}

	public List<Person> getPersons() {
		return List.of(new Person());
	}

	public PersonsDao getPersonsDao() {
		return personsDao;
	}

	public void setPersonsDao(PersonsDao personsDao) {
		this.personsDao = personsDao;
	}


	public GenderService getGenderService() {
		return genderService;
	}

	public void setGenderService(GenderService genderService) {
		this.genderService = genderService;
	}

}
