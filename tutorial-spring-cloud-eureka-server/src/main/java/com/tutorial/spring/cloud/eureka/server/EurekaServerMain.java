package com.tutorial.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Ömer ÇİLİNGİR on 28.03.2018
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain.class,args);

    }
}
