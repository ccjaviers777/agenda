package com.agenda.api.agenda.repository;

import com.agenda.api.agenda.entity.TipoIdentifiacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentifiacion, Integer> {


}
