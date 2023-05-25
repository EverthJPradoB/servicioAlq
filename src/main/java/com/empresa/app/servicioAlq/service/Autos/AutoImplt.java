package com.empresa.app.servicioAlq.service.Autos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IAuto;
import com.empresa.app.servicioAlq.models.entity.Autos;

@Service
public class AutoImplt implements IAutosService {

    @Autowired
    private IAuto autosService ;

    @Override
    public List<Autos> findAll() {
 
        return (List<Autos>) autosService.findAll();

    }
    
}
