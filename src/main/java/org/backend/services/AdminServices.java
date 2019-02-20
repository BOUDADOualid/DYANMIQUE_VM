package org.backend.services;

import java.util.List;
import java.util.Optional;

import org.backend.entities.Admin;
import org.backend.metier.AdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AdminServices {

	@Autowired
	public AdminMetier adminMetier;
    
	@RequestMapping(value="api/admins",method=RequestMethod.GET)
	public List<Admin> getAllAdmin() {
		return adminMetier.getAllAdmin();
	}
   
	@RequestMapping(value="api/admin/{id}",method=RequestMethod.GET)
	public  Optional<Admin> getOneAdmin(@PathVariable Long id) {
		return adminMetier.getOneAdmin(id);
	}
	
	
	
	
	
}
