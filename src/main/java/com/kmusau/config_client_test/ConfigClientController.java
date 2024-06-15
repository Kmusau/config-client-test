package com.kmusau.config_client_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${message}")
    private String message;

    @GetMapping("/home")
    public String welcome() {
        return message;
    }

}
