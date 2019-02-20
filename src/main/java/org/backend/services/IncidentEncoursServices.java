package org.backend.services;

import java.util.List;

import org.backend.dto.Graph;
import org.backend.entities.IncidentEncours;
import org.backend.metier.IncidentEncoursMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class IncidentEncoursServices {

	@Autowired
	private IncidentEncoursMetier incidentEncoursMetier;
    
	

	//priorite By domain
	@RequestMapping(value="/api/incidentPriorite/{id}",method=RequestMethod.GET)
	public int PrioriteByDomain(@PathVariable Long id) {
		return incidentEncoursMetier.PrioriteByDomain(id);
	}

	// domain By nom Editeur
	@RequestMapping(value = "/api/incidentEditeur/{id}", method = RequestMethod.GET)
	public int EditeurByDomain(@PathVariable Long id, @RequestParam(name = "mc", defaultValue = "") String mc) {
		return incidentEncoursMetier.EditeurByDomain(id, "%" + mc + "%");
	}

	// Domain By nom
	@RequestMapping(value = "/api/incidentEncours/{id}", method = RequestMethod.GET)
	public String EncourByDomain(@PathVariable Long id, @RequestParam(name = "mc", defaultValue = "") String mc) {
		return incidentEncoursMetier.EncourByDomain(id, "%" + mc + "%");
	}

	@RequestMapping(value = "/api/incidents", method = RequestMethod.GET)
	public List<IncidentEncours> AffichierListIncidentENcours() {
		return incidentEncoursMetier.AffichierListIncidentENcours();
	}
    
}
