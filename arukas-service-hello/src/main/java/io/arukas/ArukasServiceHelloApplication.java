package io.arukas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ArukasServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArukasServiceHelloApplication.class, args);
	}
}
