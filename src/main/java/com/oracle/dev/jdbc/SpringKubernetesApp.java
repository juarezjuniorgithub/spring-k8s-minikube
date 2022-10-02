package com.oracle.dev.jdbc;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringKubernetesApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringKubernetesApp.class, args);
	}

	@RequestMapping("/")
	public String helloSpringKubernetesApp() throws UnknownHostException {

		return "Hello from Spring App with Docker and Kubernetes @ " + InetAddress.getLocalHost();
	}
}
