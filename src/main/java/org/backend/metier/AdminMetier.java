package org.backend.metier;

import java.util.List;
import java.util.Optional;

import org.backend.entities.Admin;

public interface AdminMetier {
	
public List<Admin>getAllAdmin();
public Optional<Admin> getOneAdmin(Long id);


}
