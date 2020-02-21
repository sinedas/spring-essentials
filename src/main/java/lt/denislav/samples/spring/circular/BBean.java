package lt.denislav.samples.spring.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BBean {

	private ABean aBean;

	public BBean(ABean aBean) {
		this.aBean = aBean;
	}

	public String getName() {
		return "bBean " + aBean;
	}
}
