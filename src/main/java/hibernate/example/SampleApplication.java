package hibernate.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories
@EnableConfigurationProperties
public class SampleApplication {
    
	public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(SampleApplication.class);
        app.run(args);
	}

}
