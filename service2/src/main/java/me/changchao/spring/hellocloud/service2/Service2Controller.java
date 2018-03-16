package me.changchao.spring.hellocloud.service2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Service2Controller {
	@RequestMapping("/")
	public Mono<String> start() {
		return Mono.just("Hello from service2");
	}
}
