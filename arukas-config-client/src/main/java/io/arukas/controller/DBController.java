package io.arukas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

	@Value("${driverClassName}")
	String driverClassName;
	
	@Value("${url}")
	String url;
	
	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	@GetMapping(value = "/dbconfig")
	public Map<String, String> dbConfig(){
		Map<String, String> dbconfig = new HashMap<String, String>();
		dbconfig.put("driverClassName", driverClassName);
		dbconfig.put("url", url);
		dbconfig.put("username", username);
		dbconfig.put("password", password);
		return dbconfig;
	}
}
