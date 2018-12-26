package com.gsdk.spring.cloud.api;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.feign.*;
import org.springframework.boot.autoconfigure.*;

@FeignClient("service-hi") //调用其服务的服务名  即上一条博客（2）
public interface SchedualService {

    @RequestMapping(value="/hi",method=RequestMethod.POST)
    public String gethi();

}