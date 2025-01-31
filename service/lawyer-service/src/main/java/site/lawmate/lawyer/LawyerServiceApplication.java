package site.lawmate.lawyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@EnableDiscoveryClient
@SpringBootApplication
@EnableReactiveMongoAuditing
public class LawyerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawyerServiceApplication.class, args);
	}

}
