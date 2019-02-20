package org.backend.dao;
import java.util.List;

import org.backend.dto.Graph;
import org.backend.entities.Domain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DomainRepository extends JpaRepository<Domain, Long> {

	
	@Query("Select d from Domain d where d.nom like:x order by d.id desc")
	public Page<Domain> chercherDomain(@Param("x") String mc,Pageable pageable);
	
	
	@Query("Select new org.backend.dto.DomainDto(d.id,d.nom,d.nomEditeur) from Domain d order by d.id desc")
	public List<Domain>findAllDomainsOrderedById();
//	List<Domain>findAll(org.springframework.data.domain.Sort );
		
}
 