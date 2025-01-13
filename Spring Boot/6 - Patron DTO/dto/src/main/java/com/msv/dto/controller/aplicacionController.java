package com.msv.dto.controller;

import com.msv.dto.Inquilino;
import com.msv.dto.Propiedad;
import com.msv.dto.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {

        //A traves de la id buscamos la propiedad
        //Trajimos al inquilinos asociado a esa propiedad
        Propiedad prop = new Propiedad(15487L, "Casa", "Acosta 308", 200.0, 40000.0);
        Inquilino inqui = new Inquilino (1L, "123456789", "Walter", "Wram", "Profesor");

        //PATRON DTO
        PropiedadDTO propiDTO = new PropiedadDTO();

        //Asignamos los datos de propiedad
        propiDTO.setIdPropiedad(prop.getIdPropiedad());
        propiDTO.setTipoPropiedad(prop.getTipoPropiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValorAlquiler(prop.getValorAlquiler());

        //Asignamos los datos de inquilinos
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());

        return propiDTO;
    }
}
