package lt.denislav.samples.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MainApplication {

	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class);
	}
}
