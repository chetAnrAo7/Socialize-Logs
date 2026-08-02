package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableMongoAuditing
@EnableScheduling
public class SocializeLogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocializeLogsApplication.class, args);
	}

}
