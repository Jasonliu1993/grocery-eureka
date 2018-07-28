package com.jwebcoder.groceryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GroceryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryEurekaApplication.class, args);
    }
}
