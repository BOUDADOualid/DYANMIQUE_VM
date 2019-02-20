package org.backend.metier;
import java.util.List;

import org.backend.dto.Graph;
import org.backend.dto.GraphBar;
import org.backend.entities.Resultat;
public interface ResultatMetier {

	
	public List<Resultat> getAllResultat();
	
	public List<Resultat> findAllByDomainName();
	
	public List<Graph>allStatic();
	
	public List<GraphBar>AllStaticBarDomain();
}
