package com.agenda.api.agenda.service;


import com.agenda.api.agenda.entity.TipoIdentifiacion;
import com.agenda.api.agenda.repository.TipoIdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoIdentificacionService {


    @Autowired
    private TipoIdentificacionRepository repository;
    public TipoIdentifiacion registrar(TipoIdentifiacion tipoIdentifiacion){
        return repository.save(tipoIdentifiacion);
    }

    public List<TipoIdentifiacion> listarTodos(){
        return  repository.findAll();
    }

    public TipoIdentifiacion actualizar(TipoIdentifiacion tipoIndentificacion){
        return repository.save(tipoIndentificacion);
    }

    public Optional<TipoIdentifiacion> obtenerPorId(Integer id){
        return repository.findById(id);
    }

    public void eliminar(Integer id){
        repository.deleteById(id);
    }
}
