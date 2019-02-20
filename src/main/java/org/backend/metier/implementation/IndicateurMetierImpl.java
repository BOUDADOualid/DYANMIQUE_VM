package org.backend.metier.implementation;

import org.backend.dao.DomainRepository;
import org.backend.dao.IndicateurRepository;
import org.backend.entities.Domain;
import org.backend.entities.Indicateur;
import org.backend.metier.IndicateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicateurMetierImpl implements IndicateurMetier {

	@Autowired
	private IndicateurRepository IndicateurRepository;

	@Autowired
	private DomainRepository domainRepository;

	@Override
	public Indicateur ajouterIndicateur(Indicateur I, Domain D) {
//		Domain domain =new Domain();
		Domain	domain=domainRepository.getOne(D.getId());
		Indicateur in=new Indicateur();
//    	System.out.println("kkk"+D.toString());
//		I.setDomain(domain);
		in.setDomain(domain);
		in.setIndicateur(I.getIndicateur());
		return IndicateurRepository.save(in);
	}

}
