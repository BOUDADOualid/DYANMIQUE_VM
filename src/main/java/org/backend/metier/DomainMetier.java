package org.backend.metier;

import java.util.List;
import java.util.Optional;

import org.backend.dto.Graph;
import org.backend.entities.Domain;
import org.springframework.data.domain.Page;

public interface DomainMetier {

	public Optional<Domain> affichierDomain(Long id);

	public void ajouterDomain(Domain D);

	public void supprimerDomain(Long id);

	public void modifierDomain(Long id, Domain D);

	public List<Domain> affichierListeDomain();

	public Page<Domain> chercherDomain(String mc, int page, int size);
	
	public List<Domain> FindAllordered();
	
	
	
	
 
	
}
