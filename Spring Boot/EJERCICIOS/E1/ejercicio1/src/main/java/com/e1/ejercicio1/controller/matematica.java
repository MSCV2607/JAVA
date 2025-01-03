package com.e1.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class matematica {

    @GetMapping("/sum/{a}/{b}")
    public String suma(@PathVariable int a, @PathVariable int b) {
        int result = a + b;
        return "La suma entre los dos numero es: " + result;
    }
}
