package com.ty.Idfcmock.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Employeedto {
@Id
	private int emp_id;
	private String emp_name;
	private String emp_phnno;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_phnno() {
		return emp_phnno;
	}
	public void setEmp_phnno(String emp_phnno) {
		this.emp_phnno = emp_phnno;
	}
	
	
}
