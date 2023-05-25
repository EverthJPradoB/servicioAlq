package com.empresa.app.servicioAlq.service.Usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IUsuario;
import com.empresa.app.servicioAlq.models.entity.Usuarios;

@Service
public class UsuariosImpl implements IUsuariosService {

    @Autowired
    private IUsuario iUsuario;

    @Override
    public List<Usuarios> findAll() {
        return (List<Usuarios>) iUsuario.findAll();
    }
}
