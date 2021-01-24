package com.eStore.bear.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class EStoreAdminV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EStoreAdminV1Application.class, args);
	}

}
