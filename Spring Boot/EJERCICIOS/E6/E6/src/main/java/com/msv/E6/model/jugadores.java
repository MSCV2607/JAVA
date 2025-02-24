package com.msv.E6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class jugadores {
    long id;
    String nombre;
    String apellido;
    int edad;
    int dni;
    double peso;
    double altura;

    public jugadores() {
    }

    public jugadores(long id, String nombre, String apellido, int edad, int dni, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
}
