package com.empresa.app.servicioAlq.service.Alquiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IAlquiler;
import com.empresa.app.servicioAlq.models.entity.Alquiler;

@Service
public class AlquilerImplt implements IAlquilerService {
    
    @Autowired
    private IAlquiler alquiler;

    @Override
    public List<Alquiler> findAll() {
        
        return (List<Alquiler>) alquiler.findAll();
    }
}
