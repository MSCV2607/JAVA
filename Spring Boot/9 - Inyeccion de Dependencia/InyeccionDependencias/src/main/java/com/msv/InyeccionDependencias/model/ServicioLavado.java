package com.msv.InyeccionDependencias.model;

public class ServicioLavado {

    //Dos objetos sin instanciar
    //Dependencia entre las tres clases
    private ServicioNormal servicioNormal;
    private ServicioPremium servicioPremium;

    //Primera forma de crear inyeccion de Dependencias, mediante constructor.
    public ServicioLavado(ServicioNormal servicioNormal, ServicioPremium servicioPremium) {
        this.servicioNormal = servicioNormal;
        this.servicioPremium = servicioPremium;
    }

    //Segunda forma de inyeccion de Dependencia, mediante Setters.
    public void setServicioNormal(ServicioNormal servicioNormal) {
        this.servicioNormal = servicioNormal;
    }
    public void setServicioPremium(ServicioPremium servicioPremium) {
        this.servicioPremium = servicioPremium;
    }
}
