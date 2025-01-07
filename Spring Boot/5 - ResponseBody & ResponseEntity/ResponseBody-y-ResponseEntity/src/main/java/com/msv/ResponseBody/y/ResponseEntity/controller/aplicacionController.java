package com.msv.ResponseBody.y.ResponseEntity.controller;

import com.msv.ResponseBody.y.ResponseEntity.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class aplicacionController {

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {
        List<Cliente> ListaClientes = new ArrayList<Cliente>();

        //Suposicion de Base de Datos para hacer pruebas rapidas
        ListaClientes.add(new Cliente("Mauro","Vecchietti",1L));
        ListaClientes.add(new Cliente("Lionel","Messi",2L));
        ListaClientes.add(new Cliente("Sergio","Aguero",3L));

        return ListaClientes;
    }


    //Fuerzo a que la respuesta sea status 200 y responda un "Hello World"
    //despues del HttpStatus. ctrl + espacio todos los status code que existen
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta() {
        return new ResponseEntity<>("Hello World", HttpStatus.NOT_FOUND);
    }

}
