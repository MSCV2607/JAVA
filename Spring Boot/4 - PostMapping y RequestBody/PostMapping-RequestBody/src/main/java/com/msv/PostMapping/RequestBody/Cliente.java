package com.msv.PostMapping.RequestBody;

import lombok.Getter;
import lombok.Setter;

//Gracias a Lombok tengo todos los getters y setters creados
@Getter @Setter
public class Cliente {
    private String nombre;
    private String apellido;
    private long id;
}
