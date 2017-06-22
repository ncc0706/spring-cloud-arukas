package io.arukas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 基于文件系统的配置服务
 * @author niuyuxian
 */
@EnableConfigServer
@SpringBootApplication
public class ArukasConfigServerFilesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArukasConfigServerFilesystemApplication.class, args);
	}
}
