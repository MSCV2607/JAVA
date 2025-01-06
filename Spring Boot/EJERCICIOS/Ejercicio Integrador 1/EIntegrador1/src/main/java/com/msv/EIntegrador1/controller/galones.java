package com.msv.EIntegrador1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class galones {

    @GetMapping("/convertir/{galones}")
    public String conversor(@PathVariable float galones) {
        float convertir = galones * 3.78541f;
        return "Se debe cargar el total de " + convertir + " litros" ;
    }
}
