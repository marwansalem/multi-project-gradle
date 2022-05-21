package com.marwansalem.maxirail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxiRailController {
    @GetMapping(path = "/")
    public String getTimes() {
        return "No train times available right now :<";
    }
}
