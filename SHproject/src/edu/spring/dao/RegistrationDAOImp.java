package edu.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import edu.spring.model.Registration;
import edu.spring.model.Student;

@Repository
public class RegistrationDAOImp implements RegistrationDAO {

	@Autowired
	HibernateTemplate ht;
	
	
	@Override
	public int save(Registration s) {
		int i=(Integer) ht.save(s);
		return i;
	}

	@Override
	public void update(Registration s) {
	ht.merge(s);
	}

	@Override
	public void delete(int id) {
		ht.delete(ht.get(Registration.class, id));
	}

	@Override
	public List<Registration> get(int id) {
		List<Registration> list=(List<Registration>) ht.get(Registration.class, id);
	return list;
	}

	@Override
	public List<Registration> getAll() {
		SessionFactory f=ht.getSessionFactory();
		Session s=f.openSession();
		Query q=s.createQuery("from edu.spring.model.Registration");
		List<Registration> list=q.list();
		s.close();
		f.close();
		return list;
	}

	@Override
	public List<Registration> getAllWithCriteria(Registration s) {
		List<Registration> list = null;
	DetachedCriteria dc=DetachedCriteria.forClass(Registration.class);
	Criterion c=Restrictions.in("name", "Ankit");
		
	list=(List<Registration>) ht.findByCriteria(dc.add(c));
		return list;
	}

}
