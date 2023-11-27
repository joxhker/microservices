package com.formacion.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviciosUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUsuarioApplication.class, args);
	}

}
