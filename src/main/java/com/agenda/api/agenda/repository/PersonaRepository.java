package com.agenda.api.agenda.repository;

import com.agenda.api.agenda.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
