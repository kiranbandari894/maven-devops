package com.mulasofttechnologies.MST.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyMST {
    @GetMapping("/")
    public String hello(){
        return "Welcome to MST Pvt Ltd";
    }
}
