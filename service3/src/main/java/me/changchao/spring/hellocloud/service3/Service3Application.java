package me.changchao.spring.hellocloud.service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service3Application {
	public static void main(String[] args) {
		SpringApplication.run(Service3Application.class, args);
	}
}
