package com.empresa.app.servicioAlq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.Alquiler;
import com.empresa.app.servicioAlq.models.entity.Autos;
import com.empresa.app.servicioAlq.service.Alquiler.IAlquilerService;
import com.empresa.app.servicioAlq.service.Autos.IAutosService;

@CrossOrigin
@RestController
@RequestMapping("/Alquiler")
public class AlquilerController {
    @Autowired
    private IAlquilerService alquilerService;

    @GetMapping("/listar")
    public List<Alquiler> getAutos() {

        return alquilerService.findAll();
    }
}
