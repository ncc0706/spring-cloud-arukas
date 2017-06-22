package io.arukas.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.arukas.config.HelloMessageRibbonConfiguration;

@RestController
@RibbonClient(name = "say-hello", configuration = HelloMessageRibbonConfiguration.class)
public class HelloMessageController {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@GetMapping("/hi")
	public String say(){
		String greeting = this.restTemplate().getForObject("http://say-hello/hello", String.class);
		return String.format("%s", greeting);
	}
	
}
