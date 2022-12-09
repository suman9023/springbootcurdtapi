package com.springProject.restapi.dao;

import java.util.List;

import com.springProject.restapi.model.Worker;

public interface WorkerDAO
{
	List<Worker> get();
	Worker getById(int id);
	void save(Worker worker);
	void deleteById(int id);

}
