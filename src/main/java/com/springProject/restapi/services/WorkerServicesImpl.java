package com.springProject.restapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springProject.restapi.dao.WorkerDAO;
import com.springProject.restapi.model.Worker;

@Service
public class WorkerServicesImpl implements WorkerServices
{
	@Autowired
	WorkerDAO workerDAO;

	@Transactional
	@Override
	public List<Worker> get() {
		return workerDAO.get();
	}

	@Transactional
	@Override
	public Worker getById(int id)
	{
		return workerDAO.getById(id);
	}

	@Transactional
	@Override
	public void save(Worker worker)
	{
		workerDAO.save(worker);
	}

	@Transactional
	@Override
	public void deleteById(int id)
	{
		workerDAO.deleteById(id);
	}

	
}
