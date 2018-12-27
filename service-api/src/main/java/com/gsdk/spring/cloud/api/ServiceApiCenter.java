package com.gsdk.spring.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Spencer Gibb
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class ServiceApiCenter {
    @Autowired
    HelloClient client;

    @RequestMapping("/")
    public String hello() {
        return client.hello();
    }

    @RequestMapping("/l")
    public String lamda() {
        return client.lamda();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApiCenter.class, args);
    }

    @FeignClient("SERVICE-PROVIDER")
    interface HelloClient {
        @RequestMapping(value = "/", method = GET)
        String hello();

        @RequestMapping(value = "/lamda", method = GET)
        String lamda();
    }
}


