package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {
        @GetMapping("/holiday")
        public String getData() {return "Please book your room for 20% discount. Discount end at 20 March" ; }}
