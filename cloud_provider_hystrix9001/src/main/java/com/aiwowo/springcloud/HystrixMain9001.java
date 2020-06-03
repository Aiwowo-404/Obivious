package com.aiwowo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class HystrixMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMain9001.class, args);
    }
}
