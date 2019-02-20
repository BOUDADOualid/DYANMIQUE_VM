package org.backend.metier;

import org.backend.entities.Indicateur;
import org.backend.entities.IndicateurParam;

public interface IndicateurParamMetier {

	public IndicateurParam ajouteIndicateurParam(IndicateurParam indicateurParam, Indicateur indicateur);

}
