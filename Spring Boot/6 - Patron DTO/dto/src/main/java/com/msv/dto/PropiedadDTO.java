package com.msv.dto;

//En la respuesta no es necesario mostrar todos los datos del inquilino y la propiedad por eso vamos a usar patron DTO
//Al front no le importa el resto de datos

public class PropiedadDTO {
    private long idPropiedad;
    private String tipoPropiedad;
    private String direccion;
    private Double valorAlquiler;
    private String nombre;
    private String apellido;

    public PropiedadDTO() {
    }

    public PropiedadDTO(long idPropiedad, String tipoPropiedad, String direccion, Double valorAlquiler, String nombre, String apellido) {
        this.idPropiedad = idPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.direccion = direccion;
        this.valorAlquiler = valorAlquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(Double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

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
}
