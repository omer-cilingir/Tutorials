package com.spring.cloud.discovery.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Ömer ÇİLİNGİR on 28.03.2018
 */
@EnableEurekaClient
@SpringBootApplication
public class DiscoveryEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaClient.class,args);

    }
}
