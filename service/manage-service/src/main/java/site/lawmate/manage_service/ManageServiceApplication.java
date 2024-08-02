package site.lawmate.manage_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class ManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageServiceApplication.class, args);
	}

}
