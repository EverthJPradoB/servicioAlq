package com.empresa.app.servicioAlq.service.TIpoUsuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.app.servicioAlq.models.dao.ITipoUsuario;
import com.empresa.app.servicioAlq.models.entity.TipoUsuario;

@Service
public class TipoUsuarioImpl implements ITipoUsuarioService {

    @Autowired
    private ITipoUsuario iTipoUsuario;

    @Override
    public List<TipoUsuario> findAll() {
        
        return (List<TipoUsuario>) iTipoUsuario.findAll();
    
    }
       
}
