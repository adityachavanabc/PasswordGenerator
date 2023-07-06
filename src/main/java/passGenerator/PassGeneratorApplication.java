package passGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="package controller")
public class PassGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassGeneratorApplication.class, args);
	}

}
