package com.test.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "emp")
@Component
public class Emp {
	@Id
	@Column(name = "emp_id")
	private int emp_id;
	@Column(name = "emp_name")
	private String emp_name;

	@OneToMany(targetEntity = Goal.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private List<Goal> goals;

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

	public List<Goal> getGoals() {
		return goals;
	}

	public void setGoals(List<Goal> goals) {
		this.goals = goals;
	}


	
	

}
