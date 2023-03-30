package com.rinku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRinkuApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoRinkuApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoRinkuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.warn("Iniciando aplicacion");
		
	}

}
