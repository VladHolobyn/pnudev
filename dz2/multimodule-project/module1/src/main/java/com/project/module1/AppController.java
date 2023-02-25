package com.project.module1;

import org.example2.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @GetMapping("/")
    public String printHelloWord(){
        return "Hello form module1!";
    }

    @GetMapping("/hello{name}")
    public String printGreeting(@RequestParam("name") String name){
        String greeting;
        if ("".equals(name)){
            greeting = "Hello, anonymous!";
        }else {
            greeting = "Hello, "+ name+ "!";
        }

        String uniqueChars = Controller.getUniqueChars(List.of(greeting)).toString();

        return greeting + "<br/> Unique characters: " + uniqueChars;
    }
}
