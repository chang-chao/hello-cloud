package me.changchao.spring.hellocloud.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service1Application {

	@Bean
	@LoadBalanced
	WebClient.Builder restTemplate() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
}