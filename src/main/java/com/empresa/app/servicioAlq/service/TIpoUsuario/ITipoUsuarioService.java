package com.empresa.app.servicioAlq.service.TIpoUsuario;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.entity.TipoUsuario;


public interface ITipoUsuarioService {
    
    public List<TipoUsuario> findAll();

}
