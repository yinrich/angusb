package lab.b115.angusb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class AngusbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngusbApplication.class, args);
	}
}
