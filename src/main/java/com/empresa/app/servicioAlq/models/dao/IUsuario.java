package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.Usuarios;

public interface IUsuario extends CrudRepository<Usuarios,Integer>{
    
}
