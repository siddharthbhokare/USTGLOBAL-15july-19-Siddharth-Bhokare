package com.ust.springtaskmanagement.service;

import java.util.List;


import com.ust.springtaskmanagement.dto.TaskManagement;

public interface TaskManagementService {

	public boolean addTask(TaskManagement task);
	public boolean deleteTask(int id);
	public boolean completeTask(TaskManagement task );
	public List<TaskManagement> getAllTasks();
	public TaskManagement getTask(int id);
}
