package lt.denislav.samples.spring.service;

import lt.denislav.samples.spring.domain.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Profile("lifeCycle")
@Service
public class LifeCycleBean  implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Autowired
	private PersonsDao personsDao;

	// Don't do this, can be circular dependencies
	@Deprecated
	public LifeCycleBean(ApplicationContext applicationContext) {
		System.err.println("lifeCycleBean constructing");

		System.err.println(applicationContext.getBean("autoConfigurationService"));
	}

	@PostConstruct
	public void postConstruct() {
		System.err.println("lifeCycleBean post construct");

		personsDao.save(new Person());
	}

	@PreDestroy
	public void preDestroy() {
		System.err.println("lifeCycleBean pre destroy");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

		System.err.println("lifeCycleBean setApplicationContext, autoconfiguration:" + applicationContext.getBean("autoConfigurationService"));
	}
}
