package com.msv.E6.controller;


import com.msv.E6.model.jugadores;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class aplicacionController {
    //ArrayList para guardar jugadores creados
    private List<jugadores> jugadoresArr = new ArrayList<>();

    @PostMapping("/jugadores")
    public void nuevoJugador (@RequestBody jugadores jugador) {

    }

}
