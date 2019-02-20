package org.backend.metier.implementation;

import java.util.List;
import java.util.Optional;

import org.backend.dao.ExtractionInfoRepository;
import org.backend.entities.ExtractionInfo;
import org.backend.metier.ExtractionInfoMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtractionInfoMetierImpl implements ExtractionInfoMetier {

	@Autowired
	private ExtractionInfoRepository extractionInfoRepository;

	@Override
	public Optional<ExtractionInfo> affichierDateExtraction(Long id) {

		return extractionInfoRepository.findById(id);
	}

	@Override
	public List<ExtractionInfo> getAllDate() {

		return extractionInfoRepository.findAll();
	}

}
