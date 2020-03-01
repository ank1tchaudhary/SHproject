package edu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.dao.RegistrationDAO;
import edu.spring.model.Registration;

@Service
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
RegistrationDAO dao;
	@Override
	public int save(Registration s) {
		return dao.save(s);
	}

	@Override
	public void update(Registration s) {
		dao.update(s);

	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public List<Registration> get(int id) {
		return dao.get(id);
	}

	@Override
	public List<Registration> getAll() {
		return dao.getAll();
	}

	@Override
	public List<Registration> getAllWithCriteria(Registration s) {
		return dao.getAllWithCriteria(s);
	}

}
