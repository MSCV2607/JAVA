package com.msv.ejercicio3.controller;


import com.msv.ejercicio3.platos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class platosController {

    @GetMapping("/plato/{numero}")
    public String plato(@PathVariable int numero) {

        //Creacion de platos
        List<platos> LisPlatos = new ArrayList<platos>();
        LisPlatos.add(new platos(1,"Fideos", 1200, "Especialidad de la casa"));
        LisPlatos.add(new platos(2,"Ravioles", 1000, "Para la familia"));
        LisPlatos.add(new platos(3,"Noquis", 1500, "Ideales para un 29"));
        LisPlatos.add(new platos(4,"Pescado", 1900, "Por si no te gusta la pasta"));
        LisPlatos.add(new platos(5,"Fideos con tuco", 1800, "No te vas a querer ir mas de aca"));

        if (numero == 1) {
            return LisPlatos.get(0).toString();
        } else if (numero == 2) {
            return LisPlatos.get(1).toString();
        } else if (numero == 3) {
            return LisPlatos.get(2).toString();
        } else if (numero == 4) {
            return LisPlatos.get(3).toString();
        } else if (numero == 5) {
            return LisPlatos.get(4).toString();
        } else {
            return "ERROR: NO TENEMOS ESE PLATO";
        }
    }
}
