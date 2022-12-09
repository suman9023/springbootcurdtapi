package com.springProject.restapi.services;

import java.util.List;

import com.springProject.restapi.model.Worker;

public interface WorkerServices 
{
	List<Worker> get();
	Worker getById(int id);
	void save(Worker worker);
	void deleteById(int id);
}
