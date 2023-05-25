package com.empresa.app.servicioAlq.models.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @Column(name = "ID_ALQUILER")
    private String IdAlquiler;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO")
    private Usuarios IdUsuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AUTO")
    private Autos IdAuto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ESTADO_ALQ")
    private EstadoAlquiler IdEstadoAlquiler;

    @Column(name = "FECHA_PRES")
    private LocalDate fechaPrestamo;

    @Column(name = "FECHA_DEVO")
    private LocalDate fechaDevolucion;

    @Column(name = "NUM_DIAS")
    private int numDias;

    @Column(name = "PRECIO")
    private double precio;

    // numDias * precio
    @Column(name = "MONTO")
    private double monto;

    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "ID_USUARIO")
    // private Usuarios encargado;


  
    public Alquiler() {
    }

    // public Alquiler(String idAlquiler, Usuarios idUsuario, Autos idAuto,
    // LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String
    // encargado) {
    // //
    // IdAlquiler = idAlquiler;
    // IdUsuario = idUsuario;
    // IdAuto = idAuto;

    // this.fechaPrestamo = fechaPrestamo;
    // this.fechaDevolucion = fechaDevolucion;
    // this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    // this.precio = precio;
    // this.encargado = encargado;
    // this.vigencia = calcularVigencia();
    // //
    // }

    // public Alquiler(String idAlquiler, Usuarios idUsuario, Autos idAuto,
    // EstadoAlquiler idEstadoAlquiler,
    // LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String
    // encargado) {
    // //
    // IdAlquiler = idAlquiler;
    // IdUsuario = idUsuario;
    // IdAuto = idAuto;
    // IdEstadoAlquiler = idEstadoAlquiler;
    // this.fechaPrestamo = fechaPrestamo;
    // this.fechaDevolucion = fechaDevolucion;
    // this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    // this.precio = precio;
    // this.encargado = encargado;
    // this.vigencia = calcularVigencia();
    // //
    // }

    public String getIdAlquiler() {
        return IdAlquiler;
    }

    public void setIdAlquiler(String idAlquiler) {
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

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // public Usuarios getEncargado() {
    // return encargado;
    // }

    // public void setEncargado(Usuarios encargado) {
    // this.encargado = encargado;
    // }

}
