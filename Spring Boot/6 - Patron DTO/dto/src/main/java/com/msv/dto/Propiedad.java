package com.msv.dto;

public class Propiedad {
    private long idPropiedad;
    private String tipoPropiedad;
    private String direccion;
    private Double metrosCuadrados;
    private Double valorAlquiler;

    public Propiedad() {
    }

    public Propiedad(long idPropiedad, String tipoPropiedad, String direccion, Double metrosCuadrados, Double valorAlquiler) {
        this.idPropiedad = idPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.valorAlquiler = valorAlquiler;
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

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(Double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }
}
