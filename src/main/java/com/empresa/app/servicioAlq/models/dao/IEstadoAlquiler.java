package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.EstadoAlquiler;

public interface IEstadoAlquiler  extends CrudRepository<EstadoAlquiler  ,Integer > {
   
    
}
