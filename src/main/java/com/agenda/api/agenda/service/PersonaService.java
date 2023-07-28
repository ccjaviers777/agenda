package com.agenda.api.agenda.service;


import com.agenda.api.agenda.entity.Persona;
import com.agenda.api.agenda.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;
    public Persona registrar(Persona persona){
        return repository.save(persona);
    }

    public List<Persona> listarTodos(){
        return repository.findAll();
    }

    public Persona actualizar(Persona persona){
        return repository.save(persona);
    }

    public Optional<Persona> obtenerPorId(Integer id){
        return repository.findById(id);
    }

    public void eliminar(Integer id){
        repository.deleteById(id);
        }
}
