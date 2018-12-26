package com.gsdk;

import org.springframework.cloud.netflix.feign.*;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "eureka-demo-client")
public interface CallServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}