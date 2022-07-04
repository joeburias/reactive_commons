package org.bancolombia.dojos.reactive_commons;

import org.reactivecommons.async.impl.config.annotations.EnableDirectAsyncGateway;
import org.reactivecommons.async.impl.config.annotations.EnableMessageListeners;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDirectAsyncGateway
@EnableMessageListeners
@SpringBootApplication
public class ReactiveCommonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveCommonsApplication.class, args);
	}

}
