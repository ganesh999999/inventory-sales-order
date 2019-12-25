package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InventorySalesOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySalesOrderApplication.class, args);
	}

}
