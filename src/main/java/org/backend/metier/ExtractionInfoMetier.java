package org.backend.metier;

import java.util.List;
import java.util.Optional;

import org.backend.entities.ExtractionInfo;

public interface ExtractionInfoMetier {
	
	public Optional<ExtractionInfo> affichierDateExtraction(Long id);
	
    public List<ExtractionInfo> getAllDate();
}
