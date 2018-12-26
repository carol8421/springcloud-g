package com.gsdk.hystrixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloErrorFallBack")
    public String hello(String name) {
        return restTemplate.getForObject("http://eurekaclient/hi?name="+name+"(ribbon)", String.class);
    }

    public String helloErrorFallBack(String name) {
        return "Sorry "+name+",when you are visting ribbon hystrix project,port:"+port+",you meet an error";
    }
}
