package lt.denislav.samples.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
//	@Autowired
//	private Provider provider;

	@Autowired
	@Qualifier("googleProvider")
	private Provider provider;

	@Autowired
	private Provider googleProvider;

	@Autowired
	private Provider facebookProvider;

	public String getProviderName() {
		return provider.getName();
	}

}
