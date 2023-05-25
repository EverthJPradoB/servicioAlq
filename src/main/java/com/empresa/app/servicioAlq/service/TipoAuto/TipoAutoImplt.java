package com.empresa.app.servicioAlq.service.TipoAuto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.app.servicioAlq.models.dao.ITipoAuto;
import com.empresa.app.servicioAlq.models.entity.TipoAuto;

@Service
public class TipoAutoImplt implements ITipoAutoService {


    @Autowired
    private ITipoAuto tipo_auto;

    @Override
    @Transactional(readOnly = true)
    public List<TipoAuto> findAll() {
        // TODO Auto-generated method stub
        return (List<TipoAuto>) tipo_auto.findAll();
    }
    

    
}
