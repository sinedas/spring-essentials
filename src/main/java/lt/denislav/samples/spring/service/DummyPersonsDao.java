package lt.denislav.samples.spring.service;

import lt.denislav.samples.spring.domain.Person;
import org.springframework.stereotype.Service;

@Service("personsDao")
public class DummyPersonsDao implements PersonsDao {

	public Person save(Person person) {
		System.err.println("Save person");
		person.setId(1L);
		return person;
	}

	@Override
	public Person findById(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}
}
