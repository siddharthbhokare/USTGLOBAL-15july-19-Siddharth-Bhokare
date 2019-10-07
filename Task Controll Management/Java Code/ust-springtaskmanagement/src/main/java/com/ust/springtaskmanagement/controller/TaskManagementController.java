package com.ust.springtaskmanagement.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springtaskmanagement.dto.TaskManagement;
import com.ust.springtaskmanagement.dto.TaskResponse;
import com.ust.springtaskmanagement.service.TaskManagementService;


@RestController		
@RequestMapping("/task")
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
public class TaskManagementController {


	@Autowired
	@Qualifier("jpa")
	private TaskManagementService service;
	
	@InitBinder			
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		}
	
	
	@GetMapping(path="/get-all",produces =MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllTask(){
		TaskResponse response=new TaskResponse();
		List<TaskManagement> task=service.getAllTasks();
	
		if(task==null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setTasks(task);
		}
		return response;
		
	}
	
	@PostMapping(path="/add",produces =MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addTask(@RequestBody TaskManagement task) {
		TaskResponse response=new TaskResponse();
		if(service.addTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added into DB");
			response.setTasks(Arrays.asList(task));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not added into DB");
			
		}
		return response;
	}
	@PutMapping(path="/complete",produces =MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse completeTask(@RequestBody TaskManagement task) {
		TaskResponse response=new TaskResponse();
		if( service.completeTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Updated into DB");
			response.setTasks(Arrays.asList(task));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not updated added into DB");
		}
		return response;
		
	}
	@DeleteMapping(path="/remove/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse deleteTask(@PathVariable("id")int id) {
		TaskResponse response=new TaskResponse();
		TaskManagement task= service.getTask(id);
		if(service.deleteTask(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data deleted from DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not deleted from DB");
			response.setTasks(Arrays.asList(task));
		}
		return response; 
	}
	
	@GetMapping(path="/exception")
	public String throwException() throws Exception{
		throw new Exception();
	}
	

}
