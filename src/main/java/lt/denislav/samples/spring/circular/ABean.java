package lt.denislav.samples.spring.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ABean {

	@Autowired
	private BBean bBean;

//	public ABean(BBean bBean) {
//		this.bBean = bBean;
//	}

	public String getName() {
		return "ABean " + bBean.getName();
	}


}
