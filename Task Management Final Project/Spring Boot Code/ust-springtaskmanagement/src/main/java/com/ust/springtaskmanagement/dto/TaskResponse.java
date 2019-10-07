package com.ust.springtaskmanagement.dto;

import java.util.List;


public class TaskResponse {


	private int statusCode;
	private String message;
	private String description;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	private List<TaskManagement> tasks;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<TaskManagement> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskManagement> tasks) {
		this.tasks = tasks;
	}


}
