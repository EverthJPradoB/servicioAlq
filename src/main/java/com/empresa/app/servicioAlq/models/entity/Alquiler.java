package com.empresa.app.servicioAlq.models.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private int IdAlquiler;

    private Usuarios IdUsuario;

    private Autos IdAuto;

    private EstadoAlquiler IdEstadoAlquiler;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    private int numDias;

    private double precio;

    // numDias * precio
    // private double monto;

    private String encargado;

    private String vigencia;

    public Alquiler() {
    }

    public Alquiler(int idAlquiler, Usuarios idUsuario, Autos idAuto,
            LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String encargado) {
        //
        IdAlquiler = idAlquiler;
        IdUsuario = idUsuario;
        IdAuto = idAuto;

        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
        this.precio = precio;
        this.encargado = encargado;
        this.vigencia = calcularVigencia();
        //
    }

    public Alquiler(int idAlquiler, Usuarios idUsuario, Autos idAuto,
            EstadoAlquiler idEstadoAlquiler,
            LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String encargado) {
        //
        IdAlquiler = idAlquiler;
        IdUsuario = idUsuario;
        IdAuto = idAuto;
        IdEstadoAlquiler = idEstadoAlquiler;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
        this.precio = precio;
        this.encargado = encargado;
        this.vigencia = calcularVigencia();
        //
    }

    public int getIdAlquiler() {
        return IdAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        IdAlquiler = idAlquiler;
    }

    public Usuarios getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        IdUsuario = idUsuario;
    }

    public Autos getIdAuto() {
        return IdAuto;
    }

    public void setIdAuto(Autos idAuto) {
        IdAuto = idAuto;
    }

    public EstadoAlquiler getIdEstadoAlquiler() {
        return IdEstadoAlquiler;
    }

    public void setIdEstadoAlquiler(EstadoAlquiler idEstadoAlquiler) {
        IdEstadoAlquiler = idEstadoAlquiler;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    /// solo gets

    public String getVigencia() {
        return vigencia;
    }

    public int getNumDias() {
        return numDias;
    }

    // otros metodos

    public String calcularVigencia() {

        int diferenciaEnDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
        if (diferenciaEnDias <= 7) {
            return "Vigencia corta (1 semana)";
        } else if (diferenciaEnDias <= 30) {
            return "Vigencia mediana (1 mes)";
        } else {
            return "Vigencia larga (más de 1 mes)";
        }

    }

}
