package org.backend.metier.implementation;

import org.backend.dao.IndicateurParamRepository;
import org.backend.dao.IndicateurRepository;
import org.backend.entities.Indicateur;
import org.backend.entities.IndicateurParam;
import org.backend.metier.IndicateurParamMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicateurParamMetierImpl implements IndicateurParamMetier {

	@Autowired
	private IndicateurParamRepository indicateurParamRepository;

	@Autowired
	private IndicateurRepository indicateurRepository;

	public IndicateurParam ajouteIndicateurParam(IndicateurParam indicateurParam, Indicateur indicateur) {
		
	
		System.out.println("rrrrrrrrrrr");
//		Indicateur ind = indicateurRepository.getOne(indicateur.getId());
		IndicateurParam indiParam=new IndicateurParam();
//		ind.setIndicateur(indicateur.getIndicateur());
		
//		indiParam.setId(null);
		indiParam.setCouleur(indicateurParam.getCouleur());
		indiParam.setMax(indicateurParam.getMax());
		indiParam.setMin(indicateurParam.getMin());
		indiParam.setIndicateur(indicateur);
		System.out.println("*************");
		return indicateurParamRepository.save(indiParam);
	}

}
