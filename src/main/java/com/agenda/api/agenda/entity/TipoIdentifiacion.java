package com.agenda.api.agenda.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentifiacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_identificacion")
    private  Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;



}
