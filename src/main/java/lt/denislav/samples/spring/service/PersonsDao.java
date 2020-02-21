package lt.denislav.samples.spring.service;

import lt.denislav.samples.spring.domain.Person;

public interface PersonsDao {
	Person save(Person person);

	Person findById(Long id);

	void delete(Long id);
}
