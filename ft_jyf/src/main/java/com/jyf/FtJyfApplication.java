package com.jyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.jyf.config.EventImpl;

@SpringBootApplication
public class FtJyfApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FtJyfApplication.class, args);
		context.publishEvent(new EventImpl(new Object()));

	}
}

