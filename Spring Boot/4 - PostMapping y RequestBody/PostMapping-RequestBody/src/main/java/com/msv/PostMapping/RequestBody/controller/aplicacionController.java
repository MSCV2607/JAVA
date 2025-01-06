package com.msv.PostMapping.RequestBody.controller;

//Quiero dar de alta un cliente con ID, Nombre y Apellido

import com.msv.PostMapping.RequestBody.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    //Anotation dentro spring boot que indica que el metodo se ejecute si recibe una solicitud post
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cliente) {


        //Si todo esta bien va a mostrar este mensaje
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
    }
}
