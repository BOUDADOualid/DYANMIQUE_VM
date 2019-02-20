package org.backend.metier.implementation;

import java.util.List;

import org.backend.dao.IncidentEncoursRepository;
import org.backend.dto.Graph;
import org.backend.entities.IncidentEncours;
import org.backend.metier.IncidentEncoursMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncidentEncoursMetierImpl implements IncidentEncoursMetier {

	@Autowired
	private IncidentEncoursRepository incidentEncoursRepository;

	@Override
	public List<IncidentEncours> AffichierListIncidentENcours() {
		return incidentEncoursRepository.findAll();
	}

	@Override
	public String EncourByDomain(Long id,String mc) {
		return incidentEncoursRepository.EncourByDomain(id,mc);
	}

	@Override
	public int EditeurByDomain(Long id, String mc) {
		return incidentEncoursRepository.EditeurByDomain(id, mc);
	}

	@Override
	public int PrioriteByDomain(Long id) {
		return incidentEncoursRepository.PrioriteByDomain(id);
	}

	
	

}
