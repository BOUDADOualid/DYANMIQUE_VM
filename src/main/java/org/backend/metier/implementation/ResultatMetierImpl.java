package org.backend.metier.implementation;

import java.util.List;

import org.backend.dao.ResultatRepository;
import org.backend.dto.Graph;
import org.backend.dto.GraphBar;
import org.backend.entities.Resultat;
import org.backend.metier.ResultatMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultatMetierImpl implements ResultatMetier{
	
@Autowired
private ResultatRepository resultatRepository;

@Override
public List<Resultat> getAllResultat() {
	return resultatRepository.findAll();
}

@Override
public List<Resultat> findAllByDomainName() {
	return resultatRepository.findAllResultatByNameDomain();
}

@Override
public List<Graph> allStatic() {
	return resultatRepository.AllStaticDomain();
}

@Override
public List<GraphBar> AllStaticBarDomain() {
	return resultatRepository.AllStaticBarDomain();
}



}
