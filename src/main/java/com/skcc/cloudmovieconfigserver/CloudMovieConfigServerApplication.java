package com.skcc.cloudmovieconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudMovieConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMovieConfigServerApplication.class, args);
	}
}
