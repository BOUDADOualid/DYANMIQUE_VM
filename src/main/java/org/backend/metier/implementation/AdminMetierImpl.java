package org.backend.metier.implementation;

import java.util.List;
import java.util.Optional;

import org.backend.dao.AdminRepository;
import org.backend.entities.Admin;
import org.backend.metier.AdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminMetierImpl implements AdminMetier {
    
	@Autowired
	public AdminRepository adminRepository;
	
	@Override
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}

	@Override
	public Optional<Admin> getOneAdmin(Long id) {
		return adminRepository.findById(id);
	}

	}
