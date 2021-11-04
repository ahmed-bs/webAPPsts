package app.soaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("app.soaProject.entities")
@EnableJpaRepositories

public class WebAppStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppStsApplication.class, args);
	}
//88
}
