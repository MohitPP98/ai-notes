package com.noteverse.ai_notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class AiNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiNotesApplication.class, args);
	}

}
