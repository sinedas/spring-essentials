package lt.denislav.samples.spring.qualifier;

import org.springframework.stereotype.Service;

@Service
public class FacebookProvider implements Provider {
	@Override
	public String getName() {
		return "FaceBook";
	}
}
