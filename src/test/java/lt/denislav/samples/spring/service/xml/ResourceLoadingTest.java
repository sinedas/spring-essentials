package lt.denislav.samples.spring.service.xml;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.Charset;

public class ResourceLoadingTest {

	@Test
	public void shouldLoadResourceFromContext() throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		Resource resource = context.getResource("files/hello.txt");
		System.err.println(IOUtils.toString(resource.getInputStream(), Charset.defaultCharset()));
	}
}
