package com.devansh.springPrac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/welcome")
    public String welcomeMessage()
    {
        return"welcome to EY";
    }


}
