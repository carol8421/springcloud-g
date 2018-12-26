package com.gsdk;

import org.springframework.cloud.client.discovery.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.*;
import org.springframework.boot.builder.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.cloud.netflix.feign.*;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RoutingDemoFeignApplication {
    public static void main(String[] args) {

        SpringApplication.run(RoutingDemoFeignApplication.class, args);
    }
}