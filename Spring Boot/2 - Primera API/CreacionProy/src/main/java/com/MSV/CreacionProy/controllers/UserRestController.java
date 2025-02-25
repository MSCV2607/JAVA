package com.MSV.CreacionProy.controllers;

import com.MSV.CreacionProy.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//Ruta principal
@RequestMapping("/api")
public class UserRestController {
    //ruta secundaria
    @GetMapping("/details2")
    public Map<String, Object> details() {

        User user = new User("Andres","Rolon");


        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo con Spring");
        body.put("name", user);


        return body;
    }
}
