package br.com.pais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
"com.devmedia.server.model"
})
@EnableJpaRepositories(basePackages = {
"com.devmedia.server.repository"
})

public class PaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaisApplication.class, args);
	}
}
