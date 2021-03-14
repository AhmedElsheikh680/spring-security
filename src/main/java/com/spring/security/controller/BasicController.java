package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basic")
public class BasicController {

    @GetMapping("/mybasic")
    public String myBasic(){
        return "My Name Is Ahmed With <h1>My</h1> Basic";
    }

    @GetMapping("/allbasic")
    public String allBasic(){
        return "My Name Is Ahmed With <h1>All</h1> Basic";
    }
}
