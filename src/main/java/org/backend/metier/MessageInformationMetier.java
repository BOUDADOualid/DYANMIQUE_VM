package org.backend.metier;

import java.util.List;

import org.backend.entities.MessageInformation;

public interface MessageInformationMetier {

	
	public void ajoutermesage(MessageInformation M);
	public void supprimermesage(Long id);
	public void Modifiermessage(Long id,MessageInformation M);
	public List<MessageInformation> afficherAll();
	
}
