package com.seekheart.springdemo;

import com.seekheart.springdemo.models.Message;
import com.seekheart.springdemo.repositories.MessageRepository;
import lombok.extern.log4j.Log4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Log4j
@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner bootstrap(MessageRepository repository) {
		return (args) -> {
			repository.save(new Message(1L, "Hello"));
			repository.save(new Message(2L, "Goodbye"));
		};
	}
}
