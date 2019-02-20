package org.backend.dao;

import java.util.List;

import org.backend.dto.Graph;
import org.backend.entities.IncidentEncours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IncidentEncoursRepository extends JpaRepository<IncidentEncours, String> {

	// to count number of incident by domain with name domain
	@Query("select count(*) from IncidentEncours I where I.domain.id=:x AND I.groupeEncharge NOT like:motCle")
	public String EncourByDomain(@Param("x") Long id, @Param("motCle") String mc);

	// to count number of incident by domain with nameEditeur
	@Query("select count(*) from IncidentEncours I where I.domain.id=:x AND I.groupeEncharge like:motCle")
	public int EditeurByDomain(@Param("x") Long id, @Param("motCle") String mc);
	
	//to count priorité par domaine 
	@Query("Select count(*) from IncidentEncours I where I.domain.id=:x AND priorite=1")
	public int PrioriteByDomain(@Param("x") Long id);
	

}
