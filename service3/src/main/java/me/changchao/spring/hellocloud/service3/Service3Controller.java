package me.changchao.spring.hellocloud.service3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Service3Controller {
	@RequestMapping("/")
	public Mono<String> service() {
		return Mono.just("Hello from service3");
	}
}
