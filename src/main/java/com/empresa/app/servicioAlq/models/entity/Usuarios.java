package com.empresa.app.servicioAlq.models.entity;
public class Usuarios {
    

    private int IdUsuario;

    private TipoUsuario idTipoUsuario;

    private String dni;

    private String nombres;

    private String apeliidos;

    private String telefono;

    private String direcccion;

    private String usuario;

    private String clave;




    public Usuarios() {
    }

        

    public Usuarios(int idUsuario, TipoUsuario idTipoUsuario, String dni, String nombres, String apeliidos,
            String telefono, String direcccion, String usuario, String clave) {
        IdUsuario = idUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.dni = dni;
        this.nombres = nombres;
        this.apeliidos = apeliidos;
        this.telefono = telefono;
        this.direcccion = direcccion;
        this.usuario = usuario;
        this.clave = clave;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public TipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApeliidos() {
        return apeliidos;
    }


    public void setApeliidos(String apeliidos) {
        this.apeliidos = apeliidos;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getDirecccion() {
        return direcccion;
    }


    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }

    
    

}
