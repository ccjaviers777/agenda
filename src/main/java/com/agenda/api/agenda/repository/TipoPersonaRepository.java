package com.agenda.api.agenda.repository;

import com.agenda.api.agenda.entity.TipoPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPersonaRepository extends JpaRepository<TipoPersona, Integer> {
}
