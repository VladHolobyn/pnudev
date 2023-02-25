package com.project.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Module2SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(Module2SpringApp.class, args);
    }
    @GetMapping("/")
    public String printHelloWord(){
        return "Hello from module 2";
    }
}