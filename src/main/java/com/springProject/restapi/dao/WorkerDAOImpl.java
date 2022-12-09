package com.springProject.restapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springProject.restapi.model.Worker;

import jakarta.persistence.EntityManager;

@Repository
public class WorkerDAOImpl implements WorkerDAO
{
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Worker> get()
	{
		Session s= entityManager.unwrap(Session.class);
		Query< Worker>query= s.createQuery("from Worker",Worker.class);
		List<Worker>list= query.getResultList();
		return list;
	}


	@Override
	public void save(Worker worker)
	{
		Session s= entityManager.unwrap(Session.class);
		s.saveOrUpdate(worker);
	}
	
	@Override
	public Worker getById(int id)
	{
		Session s= entityManager.unwrap(Session.class);
		 Worker worker = s.get(Worker.class, id);
		 return worker;
	}

	@Override
	public void deleteById(int id)
	{
		Session s= entityManager.unwrap(Session.class);
		Worker worker= s.get(Worker.class, id);
		s.delete(worker);
		
	}

}
