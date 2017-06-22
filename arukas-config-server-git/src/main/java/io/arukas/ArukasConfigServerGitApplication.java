package io.arukas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ArukasConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArukasConfigServerGitApplication.class, args);
	}
}
