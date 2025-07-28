package com.gui.car_rental_eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CarRentalEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalEurekaServerApplication.class, args);
	}

}
