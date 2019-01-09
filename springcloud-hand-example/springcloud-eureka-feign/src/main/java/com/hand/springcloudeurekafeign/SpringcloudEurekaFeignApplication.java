package com.hand.springcloudeurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients
 * 开启feign
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaFeignApplication.class, args);
    }

}

