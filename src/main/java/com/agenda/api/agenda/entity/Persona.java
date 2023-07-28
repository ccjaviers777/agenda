package com.agenda.api.agenda.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private  Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "numero_identificacion")
    private Integer numeroIdentificacion;

    @Column(name = "fecha_nacimineto")
    private LocalDateTime fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_identificacion_fk", referencedColumnName = "id_tipo_identificacion")
    private TipoIdentifiacion tipoIdentifiacion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_persona_fk", referencedColumnName = "id_tipo_persona")
    private TipoPersona tipoPersona;

}
