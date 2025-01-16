package com.example.Arquitectura.service;

import java.util.List;

import com.example.Arquitectura.model.Persona;


public interface IPersonaService {

    //Todos los metodos que PersonaService va a poder implementar por ejemplo

    //Declaracion de metodos sin implementar
    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();

}
