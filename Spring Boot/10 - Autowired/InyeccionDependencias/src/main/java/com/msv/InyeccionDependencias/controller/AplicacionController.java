package com.msv.InyeccionDependencias.controller;

import com.msv.InyeccionDependencias.model.Posteo;
import com.msv.InyeccionDependencias.repository.IPosteoRepository;
import com.msv.InyeccionDependencias.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AplicacionController {

    @Autowired
    IPosteoRepository repo;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {



        return repo.traerTodos();
    }
}
