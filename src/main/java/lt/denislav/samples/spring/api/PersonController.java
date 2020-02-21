package lt.denislav.samples.spring.api;

import lt.denislav.samples.spring.domain.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@PostMapping("person-save")
	public Person savePerson(@RequestBody @Validated Person person) {
		return person;
	}
}
