package org.backend.services;

import java.util.List;

import org.backend.dto.Graph;
import org.backend.dto.GraphBar;
import org.backend.entities.Resultat;
import org.backend.metier.ResultatMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ResultatServices {
	
	
	@Autowired
	private ResultatMetier resultatMetier;
    
	
	@RequestMapping(value = "/api/static/resultatsbar", method = RequestMethod.GET)
	public List<GraphBar> AllStaticBarDomain() {
		return resultatMetier.AllStaticBarDomain();
	}



	@RequestMapping(value = "/api/static/resultats", method = RequestMethod.GET)
	public List<Graph> allStatic() {
		return resultatMetier.allStatic();
	}
   
	

	@RequestMapping(value = "/api/resultatsbydomain", method = RequestMethod.GET)
	public List<Resultat> findAllByDomainName() {
		return resultatMetier.findAllByDomainName();
	}


	@RequestMapping(value = "/api/resultats", method = RequestMethod.GET)
	public List<Resultat> getAllResultat() {
		return resultatMetier.getAllResultat();
	}
	
	
	
	

}
