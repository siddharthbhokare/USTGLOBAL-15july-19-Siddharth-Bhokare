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
@Table(name = "Employee_Info")
public class EmployeeInfo {

	@Id
	@Column
	private int Employee_ID;
	@Column
	private String Employee_Name;
	@Column
	private String Employee_Type;
	@Column
	private String Email;
	@Column
	private String Password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Employee_ID" , nullable = false)
	List<LeaveInfo> LI;

	public int getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public String getEmployee_Type() {
		return Employee_Type;
	}

	public void setEmployee_Type(String employee_Type) {
		Employee_Type = employee_Type;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<LeaveInfo> getLI() {
		return LI;
	}

	public void setLI(List<LeaveInfo> lI) {
		LI = lI;
	}

}
