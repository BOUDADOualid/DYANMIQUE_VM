package org.backend.metier.implementation;

import java.util.List;
import java.util.Optional;

import org.backend.dao.DomainRepository;
import org.backend.dto.Graph;
import org.backend.entities.Domain;
import org.backend.metier.DomainMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DomainMetierImpl implements DomainMetier {

	@Autowired
	private DomainRepository domainRepository;
	
//	@Autowired
//	private IndicateurRepository indicateurRepository;

//	@Autowired
//	private IndicateurParamRepository IndicateurParamRepository;

	@Override
	public void ajouterDomain(Domain D) {
		 domainRepository.save(D);
	}

	@Override
	public void supprimerDomain(Long D) {
		domainRepository.deleteById(D);
	}

	@Override
	public void modifierDomain(Long id, Domain D) {
		D.setId(id);
		domainRepository.save(D);
	}

	@Override
	public List<Domain> affichierListeDomain() {
		return domainRepository.findAll();
	}

	@Override
	public Optional<Domain> affichierDomain(Long id) {
		return domainRepository.findById(id);
	}

	@Override
	public Page<Domain> chercherDomain(String mc, int page,int size) {
		return domainRepository.chercherDomain(mc,new PageRequest(page, size));
	}

	@Override
	public List<Domain> FindAllordered() {
		return domainRepository.findAllDomainsOrderedById();
	}

	

	



	

}
