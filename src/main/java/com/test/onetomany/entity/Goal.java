package com.test.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "goal")
@Component
public class Goal {
	@Id
	@Column(name = "goal_id")
	private int goal_id;
	@Column(name = "goal_name")
	private String goal_name;
	@Column(name = "emp_id")
	private int emp_id;
	
	@ManyToOne(targetEntity = Emp.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id", insertable = false, updatable = false)
	private Emp emps;
	
	@OneToMany(targetEntity = GolaComp.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
	@JoinColumn(name = "goal_id", referencedColumnName = "goal_id")
	private List<GolaComp> goalComps;
	
	public int getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(int goal_id) {
		this.goal_id = goal_id;
	}

	public String getGoal_name() {
		return goal_name;
	}

	public void setGoal_name(String goal_name) {
		this.goal_name = goal_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public List<GolaComp> getGoalComps() {
		return goalComps;
	}

	public void setGoalComps(List<GolaComp> goalComps) {
		this.goalComps = goalComps;
	}




	

}
