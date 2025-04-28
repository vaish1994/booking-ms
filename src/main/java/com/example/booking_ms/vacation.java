package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vacation {
    @GetMapping("/vacation")
    public String getData() {return "its vacation" ; }
}




