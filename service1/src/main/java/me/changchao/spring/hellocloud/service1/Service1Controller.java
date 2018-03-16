package me.changchao.spring.hellocloud.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class Service1Controller {
	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	public Mono<String> start() {
		Mono<String> service2Result = webClientBuilder.build().get().uri("http://service2/").retrieve()
				.bodyToMono(String.class);

		Mono<String> service3Result = webClientBuilder.build().get().uri("http://service3/").retrieve()
				.bodyToMono(String.class);

		return Mono.zip(service2Result, service3Result).map(t -> t.getT1() + System.lineSeparator() + t.getT2());
	}
}
