package com.agenda.api.agenda.controller;

import com.agenda.api.agenda.entity.Persona;
import com.agenda.api.agenda.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @PostMapping
    public Persona registrar(@RequestBody Persona persona){
        //System.out.println(persona);
      return   personaService.registrar(persona);

    }

    @GetMapping
    public List<Persona> listarTodos(){
        return personaService.listarTodos();
    }
}
