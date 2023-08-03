package com.anniyamtech.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class DockerDemoApplication {
	@GetMapping("/welcome/{name}")
	 public String welcome(@PathVariable String name) {
	  return "Hello, "+name + "!  Welcome to the website! ";
	 }

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}


}
