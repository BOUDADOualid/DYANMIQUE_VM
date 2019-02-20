package org.backend.metier.implementation;

import java.util.List;

import org.backend.dao.IncidentEncoursRepository;
import org.backend.dao.IncidentResolusRepository;
import org.backend.entities.IncidentResolus;
import org.backend.metier.ResolusMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IncidentResolusMetierImpl implements ResolusMetier {

	@Autowired
	private IncidentResolusRepository incidentResolusRepository;
	
	
	@Override
	public List<IncidentResolus> listResolus() {
		
		return incidentResolusRepository.findAll();
	}

}
