package lt.denislav.samples.spring.service;

import org.springframework.stereotype.Service;

@Service
public class GenderService {

	public String getGender(String personCode) {
		if (personCode.startsWith("3") || personCode.startsWith("5")) {
			return "Man";
		} else if (personCode.startsWith("3") || personCode.startsWith("5")) {
			return "Woman";
		} else {
			return "?";
		}
	}
}
