package edu.spring.dao;

import java.util.List;

import edu.spring.model.Registration;
import edu.spring.model.Student;

public interface RegistrationDAO {

	public int save(Registration s);
	public void update(Registration s);
	public void delete(int id);
	public List<Registration> get(int id);
	public List<Registration> getAll();
	public List<Registration> getAllWithCriteria(Registration s);
}
