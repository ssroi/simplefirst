package com.practicedocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

    @GetMapping("")
    public String simpleResponse() {

        return "Wooooooow it Works! /s";
    }
}
