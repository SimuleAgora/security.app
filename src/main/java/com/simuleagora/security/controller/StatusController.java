package com.simuleagora.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/api/ping")
    public String ping() {
        return "pong";
    }
}
