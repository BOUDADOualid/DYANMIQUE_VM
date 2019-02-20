package org.backend.services;

import java.util.List;

import org.backend.entities.IncidentResolus;
import org.backend.metier.ResolusMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class IncidentResolusService {
	
	@Autowired
	private ResolusMetier resolusMetier;
    
	
	@RequestMapping(value="/api/Resolus",method=RequestMethod.GET)
	public List<IncidentResolus> listResolus() {
		return resolusMetier.listResolus();
	}
	

}
