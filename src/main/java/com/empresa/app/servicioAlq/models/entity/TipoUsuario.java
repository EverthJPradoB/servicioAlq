package com.empresa.app.servicioAlq.models.entity;

public class TipoUsuario {
    
    
    private int IdTipoUsuario;

    private String NombreTipoUsuario;

    public TipoUsuario() {
    }





    public TipoUsuario(int idTipoUsuario, String nombreTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
        NombreTipoUsuario = nombreTipoUsuario;
    }

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return NombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        NombreTipoUsuario = nombreTipoUsuario;
    }



}
