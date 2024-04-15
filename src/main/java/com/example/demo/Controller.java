package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class Controller {

    @Autowired
    private LocalService localService;

    @GetMapping(value = "message")
    public String getMessage() {
        return localService.getValue("welcome.message", "Bassam Almahdy");
    }
}
