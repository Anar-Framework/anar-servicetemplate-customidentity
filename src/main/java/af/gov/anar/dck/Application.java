package af.gov.anar.dck;

import af.gov.anar.lang.applicationname.EnableApplicationName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableApplicationName
@ComponentScan(basePackages = {"af.*"})
@EnableJpaRepositories(basePackages = {"af.*"})
@EntityScan(basePackages = {"af.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
