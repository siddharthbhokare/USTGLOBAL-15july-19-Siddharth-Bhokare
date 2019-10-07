package com.ust.springtaskmanagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springtaskmanagement.dto.TaskManagement;
import com.ust.springtaskmanagement.repository.TaskRepository;

@Service("jpa")
public class TaskManagementJPAImpl implements TaskManagementService{

	@Autowired
	private TaskRepository repository;
	@Override
	public boolean addTask(TaskManagement task) {
		repository.save(task);
		return true;
	}

	@Override
	public boolean deleteTask(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean completeTask(TaskManagement task) {
		Date date = new Date();
		repository.completeTask(date,task.getTask_id());
		return true;
	}

	@Override
	public List<TaskManagement> getAllTasks() {
		return repository.findAll();
		
	}

	@Override
	public TaskManagement getTask(int id) {
		
		 return  repository.findById(id).get();
	
	}

}
