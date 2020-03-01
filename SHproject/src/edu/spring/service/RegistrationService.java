package edu.spring.service;

import java.util.List;

import edu.spring.model.Registration;

public interface RegistrationService {

	public int save(Registration s);
	public void update(Registration s);
	public void delete(int id);
	public List<Registration> get(int id);
	public List<Registration> getAll();
	public List<Registration> getAllWithCriteria(Registration s);
	
}
