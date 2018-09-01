package com.upram.TestSlate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1/testaController")
public class TestController {
    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping("testMapping")
    public String testmapping(){
        return "testMapping";
    }
}
