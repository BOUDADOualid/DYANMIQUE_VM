package org.backend.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.backend.ListValueOfIndicateur;
import org.backend.listValueOfIndicateurParam;
import org.backend.dto.Graph;
import org.backend.entities.Domain;
import org.backend.entities.Indicateur;
import org.backend.entities.IndicateurParam;
import org.backend.metier.DomainMetier;
import org.backend.metier.IndicateurMetier;
import org.backend.metier.IndicateurParamMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DomainServices {

	@Autowired
	private DomainMetier serviceDomain;

	@Autowired
	private IndicateurMetier indicateurMetier;

	@Autowired
	private IndicateurParamMetier indicateurParamMetier;

	@RequestMapping(value = "api/chercherDomain", method = RequestMethod.GET)
	public Page<Domain> chercherDomain(@RequestParam(name = "mc", defaultValue = "") String mc,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "4") int size) {
		return serviceDomain.chercherDomain("%" + mc + "%", page, size);
	}

	@RequestMapping(value = "/api/domains/{id}", method = RequestMethod.GET)
	public Optional<Domain> domainbyId(@PathVariable Long id) {
		return serviceDomain.affichierDomain(id);
	}

	@Transactional
	@RequestMapping(value = "/api/domain", method = RequestMethod.POST)
	public void ajouterDomain(@RequestBody Domain D) {
		serviceDomain.ajouterDomain(D);
		System.out.println(D);
		for (Indicateur inc : ListValueOfIndicateur.listIndicateur) {
			Indicateur indicateur = indicateurMetier.ajouterIndicateur(inc, D);
			for (IndicateurParam incParam : listValueOfIndicateurParam.listIndicateurParam) {
				System.out.println("befor" + indicateur.toString());
				indicateurParamMetier.ajouteIndicateurParam(incParam, indicateur);
				System.out.println("after" + indicateur.toString());
			}
		}
	}

	@RequestMapping(value = "/api/domain/{id}", method = RequestMethod.DELETE)
	public void supprimerDomain(@PathVariable Long id) {
		serviceDomain.supprimerDomain(id);
	}

	@RequestMapping(value = "/api/domain/{id}", method = RequestMethod.PUT)
	public void modifierDomain(@PathVariable Long id, @RequestBody Domain D) {
		serviceDomain.modifierDomain(id, D);
	}

	@RequestMapping(value = "/api/domains", method = RequestMethod.GET)
	public List<Domain> affichierListeDomain() {
		return serviceDomain.FindAllordered();
	}
    
	
	
	
	
}
