package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returnback {
    @GetMapping("/returnback")
    public String getData() {return "vacation is now over!!!" ; }
}




