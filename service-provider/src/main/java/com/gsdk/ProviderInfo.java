package com.gsdk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderInfo {
    @RequestMapping("/sinfo")
    public String info() {
        return "It works!";
    }
}
