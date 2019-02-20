package org.backend.dao;
import java.util.List;

import org.backend.dto.Graph;
import org.backend.dto.GraphBar;
import org.backend.entities.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResultatRepository extends JpaRepository<Resultat, Long> {

	
	@Query(value = "SELECT r.domain,r.domain.nom as nom,r FROM Resultat r ")
	List<Resultat> findAllResultatByNameDomain();
	
	@Query("Select new org.backend.dto.Graph(r.domain.nom,r.encours)from Resultat r")
	public List<Graph>AllStaticDomain();
	
	@Query("Select new org.backend.dto.GraphBar(r.domain.id,r.domain.nom,r.encours,r.resolu)from Resultat r")
	public List<GraphBar>AllStaticBarDomain();
	
	
}
