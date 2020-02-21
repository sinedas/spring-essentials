package lt.denislav.samples.spring.api;

import lt.denislav.samples.spring.circular.ABean;
import lt.denislav.samples.spring.qualifier.ProviderService;
import lt.denislav.samples.spring.service.AutoConfigurationService;
import lt.denislav.samples.spring.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@Autowired
	private AutoConfigurationService configurationService;

	@Autowired
	private ProviderService providerService;

	@Autowired
	ABean aBean;

	@GetMapping("/version")
	public String getVersion() {
		return configurationService.getVersion() + "\r\n" +
				providerService.getProviderName()	;
	}

	@GetMapping("/circular")
	public String circular() {
		return aBean.getName();
	}
}
