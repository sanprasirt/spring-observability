package vn.cloud.helloservice;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloServiceApplication {
	private static final Log logger = LogFactory.getLog(HelloServiceApplication.class);


	@RequestMapping("/")
	String home() {
		logger.info("Home() has been called");
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}
