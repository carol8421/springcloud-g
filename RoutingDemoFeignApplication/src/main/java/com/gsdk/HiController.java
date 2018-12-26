package com.gsdk;

import org.springframework.cloud.netflix.feign.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
public class HiController {
    @Autowired
    private CallServiceHi hiServiceCaller;


    @RequestMapping("hi")
    public String hi(@RequestParam String name) {
        return hiServiceCaller.sayHiFromClientOne(name);
    }
}