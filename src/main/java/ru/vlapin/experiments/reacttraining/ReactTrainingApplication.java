package ru.vlapin.experiments.reacttraining;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
@EnableFeignClients("ru.vlapin.experiments.reacttraining.services")
public class ReactTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactTrainingApplication.class, args);
	}

}

