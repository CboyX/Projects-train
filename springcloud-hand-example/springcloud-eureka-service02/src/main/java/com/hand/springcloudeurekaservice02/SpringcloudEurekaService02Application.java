package com.hand.springcloudeurekaservice02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaService02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaService02Application.class, args);
    }

}

