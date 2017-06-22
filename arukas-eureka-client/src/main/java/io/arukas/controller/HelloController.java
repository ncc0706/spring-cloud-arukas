package io.arukas.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping(value = "/hello")
	public String hello(){
		List<String> greetings = Arrays.asList("Hello Java", "Hello C++", "Hello Erlang");
		String greeting = greetings.get(new Random().nextInt(greetings.size()));
		return String.format("serverPort: %s %s", serverPort, greeting);
	}
	
}
