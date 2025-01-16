package com.example.Arquitectura.service;

import com.example.Arquitectura.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

//Anotation para saber que es un servicio
@Service
public class PersonaService implements IPersonaService {
    @Override
    public void crearPersona(Persona per) {
        //Logica de creacion
        System.out.println("Persona creada con exito");
    }

    @Override
    public List<Persona> traerPersonas() {
        //Aca deberia traer toda la lista de persona
        return List.of();
    }

    //Metodos de logica de negocio


}
