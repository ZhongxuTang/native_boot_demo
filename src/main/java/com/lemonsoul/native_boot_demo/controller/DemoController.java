package com.lemonsoul.native_boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzx
 */
@RestController("/")
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "Hello world";
    }

}
