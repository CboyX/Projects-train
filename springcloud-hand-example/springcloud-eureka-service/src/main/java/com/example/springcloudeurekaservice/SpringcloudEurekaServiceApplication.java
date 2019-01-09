package com.example.springcloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient
 * 该注解表明应用既作为eureka实例又为eureka client 可以发现注册的服务
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServiceApplication.class, args);
    }

}

