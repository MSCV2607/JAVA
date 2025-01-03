package com.e2.ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IMC {

    @GetMapping("/IMC") // Se accede con parámetros en la URL
    public String imc(@RequestParam double peso, @RequestParam double altura) {

        // Validación de valores
        if (peso <= 0 || altura <= 0) {
            return "Valores inválidos. Peso y altura deben ser mayores que cero.";
        }

        // Cálculo del IMC
        double imc = peso / (altura * altura);

        // Evaluación del resultado
        if (imc < 18.5) {
            return "Posee peso insuficiente";
        } else if (imc < 25) {
            return "Posee peso normal";
        } else if (imc < 30) {
            return "Posee sobrepeso";
        } else {
            return "Posee obesidad";
        }
    }
}
