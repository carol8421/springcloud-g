package com.gaofei;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.*;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
//@EnableEurekaServer//表明自己是注册中心

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterProvider {
    public static void main(String[] args) {

        SpringApplication.run(RegisterCenterProvider.class,args);
    }
}
