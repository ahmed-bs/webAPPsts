package app.soaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EntityScan("app.soaProject.entities")
@EnableJpaRepositories
@EnableWebSecurity
public class WebAppStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppStsApplication.class, args);
	}
}
