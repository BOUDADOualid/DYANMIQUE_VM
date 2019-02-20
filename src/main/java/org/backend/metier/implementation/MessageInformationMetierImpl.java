package org.backend.metier.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.backend.dao.MessageInformationRepository;
import org.backend.entities.MessageInformation;
import org.backend.metier.MessageInformationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageInformationMetierImpl implements MessageInformationMetier {
	
	@Autowired 
	private MessageInformationRepository messageInformationRepository;
    
	@Transactional
	@Override
	public void ajoutermesage(MessageInformation M) {
		messageInformationRepository.save(M);
		
	}

	@Override
	public void supprimermesage(Long id) {
		messageInformationRepository.deleteById(id);
		
	}

	public void Modifiermessage(Long id,MessageInformation M) {
		M.setId(id);
		messageInformationRepository.save(M);
		
	}

	@Override
	public List<MessageInformation> afficherAll() {
		return messageInformationRepository.findAll();
	}

}
