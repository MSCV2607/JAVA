package com.apimsv.PrimeraAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Para diferenciar cada getmapping indico la ruta con ("/")
    //Parametro va entre llaves
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello World " + name;
    }

    //Los espacios se rellenan con %20 en la URL WEB
    @GetMapping("/bye/{name}/{age}/{job}")
    public String sayBye(@PathVariable String name, @PathVariable int age, @PathVariable String job) {
        return "Bye World " + name + " " + age + " " + job;
    }
}
