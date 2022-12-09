package com.springProject.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.restapi.model.Worker;
import com.springProject.restapi.services.WorkerServices;

@RestController
@RequestMapping("/api")
public class WorkerController
{
	@Autowired
	WorkerServices workerServices;
	
	@GetMapping("/worker")
	public List<Worker> get()
	{
		return workerServices.get();
	}
	
	@GetMapping("/worker/{id}")
	public Worker getById(@PathVariable int id)
	{
		return workerServices.getById(id);
	}
	
	@DeleteMapping("/worker/{id}")
	public String deleteById(@PathVariable int id)
	{
		workerServices.deleteById(id);
		
		return "deleted sucessfully";
	}
	
	@PutMapping("worker")
	public Worker update(@RequestBody Worker worker)
	{
		 workerServices.save(worker);
		 return worker;
	}
	
	@PostMapping("/worker")
	public String save(@RequestBody Worker worker)
	{
		 workerServices.save(worker);
		 
		 return "saved sucessfyully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
