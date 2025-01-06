package com.msv.PostMapping.RequestBody;

import lombok.Getter;
import lombok.Setter;

//Gracias a Lombok tengo todos los getters y setters creados
//@Getter @Setter
public class Cliente {
    private String nombre;
    private String apellido;
    private long id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
