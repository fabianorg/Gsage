package gsage.com.br.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"gsage.com.br.controller"})
@EnableJpaRepositories(basePackages = "gsage.com.br.repository")
@EntityScan(basePackages = {"gsage.com.br.model"})
public class GsageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsageApplication.class, args);
	}

}
