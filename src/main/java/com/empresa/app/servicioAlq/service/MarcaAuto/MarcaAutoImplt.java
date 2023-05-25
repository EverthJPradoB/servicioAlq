package com.empresa.app.servicioAlq.service.MarcaAuto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IMarcaAuto;
import com.empresa.app.servicioAlq.models.entity.MarcaAuto;

@Service
public class MarcaAutoImplt implements IMarcaAutoService {

    @Autowired
    private IMarcaAuto marcaAuto;

    @Override
    public List<MarcaAuto> findAll() {
    
        return (List<MarcaAuto>) marcaAuto.findAll();
    }
    

}
