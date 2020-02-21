package lt.denislav.samples.spring.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class GoogleProvider implements Provider {

	@Override
	public String getName() {
		return "google";
	}
}
