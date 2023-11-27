package com.formacion.app.rol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviciosRolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRolApplication.class, args);
	}

}
