package org.backend.services;

import java.util.List;
import java.util.Optional;

import org.backend.entities.ExtractionInfo;
import org.backend.metier.ExtractionInfoMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ExtractionInfoServices {

	@Autowired
	private ExtractionInfoMetier extractioninfoservice;

	@RequestMapping(value = "api/extract/{id}", method = RequestMethod.GET)
	public Optional<ExtractionInfo> affichierDateExtraction(@PathVariable Long id) {
		return extractioninfoservice.affichierDateExtraction(id);
	}
    
	@RequestMapping(value = "/api/extract", method = RequestMethod.GET)
	public List<ExtractionInfo> getAllDate() {
		return extractioninfoservice.getAllDate();
	}

}
