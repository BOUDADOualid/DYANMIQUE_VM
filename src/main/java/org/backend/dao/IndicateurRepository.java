package org.backend.dao;

import org.backend.entities.Indicateur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IndicateurRepository extends JpaRepository<Indicateur, Long> {

}
