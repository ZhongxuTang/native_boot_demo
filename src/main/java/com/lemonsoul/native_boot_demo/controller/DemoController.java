package com.lemonsoul.native_boot_demo.controller;

import com.lemonsoul.native_boot_demo.entity.NativeUser;
import com.lemonsoul.native_boot_demo.service.NativeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author tzx
 */
@RestController()
@RequestMapping("/user")
public class DemoController {

    private final NativeUserService nativeUserService;

    @Autowired
    public DemoController(NativeUserService nativeUserService) {
        this.nativeUserService = nativeUserService;
    }

    @GetMapping("/demo")
    public String demo(){
        return "Hello world";
    }

    @PostMapping("/create")
    public String createUser(@RequestBody NativeUser nativeUser){
        return this.nativeUserService.createUser(nativeUser) ? "success" : "fail";
    }

    @GetMapping("/page")
    public Page<NativeUser> page(Integer num, Integer size){
        PageRequest pageRequest = PageRequest.of(num, size);
        return this.nativeUserService.page(pageRequest);
    }
}
