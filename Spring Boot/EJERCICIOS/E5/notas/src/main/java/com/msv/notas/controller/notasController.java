package com.msv.notas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class notasController {

    @GetMapping("/notas")
    public String darNotas(@RequestParam int nota1,
                           @RequestParam int nota2,
                           @RequestParam int nota3) {

        float promedio = (float) (nota1 + nota2 + nota3) /3;
        return "Tu promedio es: " + promedio;
    }

}
