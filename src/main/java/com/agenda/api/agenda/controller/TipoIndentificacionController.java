package com.agenda.api.agenda.controller;

import com.agenda.api.agenda.entity.Persona;
import com.agenda.api.agenda.entity.TipoIdentifiacion;
import com.agenda.api.agenda.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TipoIndentificacionController {

    @Autowired
    private TipoIdentificacionService service;

    @PostMapping("/guardar")
    public TipoIdentifiacion registrar(@RequestBody TipoIdentifiacion tipoIdentifiacion){
        //System.out.println(tipoIdentifiacion);
        return service.registrar(tipoIdentifiacion);
    }

   /* public List<TipoIdentifiacion> listarTdos(){
        return service.registrar(tipoIdentificacion)
    }*/
    @GetMapping("/listar")
    public List<TipoIdentifiacion> listarTodos(){
        return service.listarTodos();
    }
}
