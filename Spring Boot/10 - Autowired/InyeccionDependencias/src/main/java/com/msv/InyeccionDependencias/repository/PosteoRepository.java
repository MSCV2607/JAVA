package com.msv.InyeccionDependencias.repository;

import com.msv.InyeccionDependencias.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoRepository {
    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> Lposteos = new ArrayList<Posteo>();

        //Simulacion posteo de forma logica
        Lposteos.add(new Posteo(1L, "Como reiniciar PC", "MS"));
        Lposteos.add(new Posteo(2L, "Como mantener seguridad PC", "MV"));

        return Lposteos;
    }
}
