package com.ust.springtaskmanagement.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.springtaskmanagement.dto.TaskManagement;

public interface TaskRepository extends JpaRepository<TaskManagement , Integer> {
	@Transactional				//used for acceptiong changes
	@Modifying
	@Query("update TaskManagement set task_end_date=:task_end_date  where task_id=:task_id")
	public void completeTask(@Param("task_end_date")Date task_end_date,@Param("task_id")int task_id);
	
	

}
