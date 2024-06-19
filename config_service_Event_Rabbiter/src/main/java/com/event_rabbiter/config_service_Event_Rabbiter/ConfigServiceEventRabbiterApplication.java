package com.event_rabbiter.config_service_Event_Rabbiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceEventRabbiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceEventRabbiterApplication.class, args);
	}

}
