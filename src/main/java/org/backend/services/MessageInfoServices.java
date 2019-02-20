package org.backend.services;

import java.util.List;

import org.backend.entities.MessageInformation;
import org.backend.metier.MessageInformationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MessageInfoServices {

	@Autowired
	private MessageInformationMetier messageInformationMetier;
    
	
	@RequestMapping(value="/api/message",method=RequestMethod.POST)
	public void ajoutermesage(@RequestBody MessageInformation M) {
		messageInformationMetier.ajoutermesage(M);
	}
    
	
	@RequestMapping(value="api/message/{id}",method=RequestMethod.DELETE)
	public void supprimermesage(@PathVariable Long id) {
		messageInformationMetier.supprimermesage(id);
	}
    
	@RequestMapping(value="api/message/{id}",method=RequestMethod.PUT)
	public void Modifiermessage(@PathVariable Long id,@RequestBody MessageInformation M) {
		messageInformationMetier.Modifiermessage(id, M);
	}
    
	@RequestMapping(value="api/messages")
	public List<MessageInformation> afficherAll() {
		return messageInformationMetier.afficherAll();
	}
	
	
	
	
}
