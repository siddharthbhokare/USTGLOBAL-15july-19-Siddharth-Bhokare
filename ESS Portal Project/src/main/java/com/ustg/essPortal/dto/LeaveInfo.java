package com.ustg.essPortal.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeLeaveInfo")
public class LeaveInfo {

	@Id
	@Column
	private int Employee_ID;
	@Column
	private String Leave_Date;
	@Column
	private String Leave_Status;

	public int getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getLeave_Date() {
		return Leave_Date;
	}

	public void setLeave_Date(String leave_Date) {
		Leave_Date = leave_Date;
	}

	public String getLeave_Status() {
		return Leave_Status;
	}

	public void setLeave_Status(String leave_Status) {
		Leave_Status = leave_Status;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Employee_ID" , nullable = false)
	List<EmployeeInfo> einfo ;

	public List<EmployeeInfo> getEinfo() {
		return einfo;
	}

	public void setEinfo(List<EmployeeInfo> einfo) {
		this.einfo = einfo;
	}

}
