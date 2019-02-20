package org.backend.metier;

import java.util.List;

import org.backend.dto.Graph;
import org.backend.entities.IncidentEncours;

public interface IncidentEncoursMetier {

	public List<IncidentEncours> AffichierListIncidentENcours();
    
	public String EncourByDomain(Long id, String mc);
	
	public int EditeurByDomain(Long id, String mc);
	
	public int PrioriteByDomain(Long id);
	
	
}
