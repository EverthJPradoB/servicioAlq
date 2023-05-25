package com.empresa.app.servicioAlq.models.entity;


public class EstadoAlquiler {
    
    private int IdEstadoAlquiler;

    private String Estado;

    

    public EstadoAlquiler() {
    }


    
    public EstadoAlquiler(int idEstadoAlquiler, String estado) {
        IdEstadoAlquiler = idEstadoAlquiler;
        Estado = estado;
    }



    public int getIdEstadoAlquiler() {
        return IdEstadoAlquiler;
    }

    public void setIdEstadoAlquiler(int idEstadoAlquiler) {
        IdEstadoAlquiler = idEstadoAlquiler;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }


    
}
