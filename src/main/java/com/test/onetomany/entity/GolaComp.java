package com.test.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//golacomp
@Entity
@Table(name = "golacomp")
@Component
public class GolaComp {
	@Id
	@Column(name = "goal_comp_id")
	private int goal_comp_id;
	@Column(name = "goal_comp_name")
	private String goal_comp_name;
	@Column(name = "goal_id")
	private int goal_id;

	/**
	 * 
	 */
	@ManyToOne(targetEntity = Goal.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "goal_id", referencedColumnName = "goal_id", insertable = false, updatable = false)
	private Goal goals;

	public int getGoal_comp_id() {
		return goal_comp_id;
	}

	public void setGoal_comp_id(int goal_comp_id) {
		this.goal_comp_id = goal_comp_id;
	}

	public String getGoal_comp_name() {
		return goal_comp_name;
	}

	public void setGoal_comp_name(String goal_comp_name) {
		this.goal_comp_name = goal_comp_name;
	}

	public int getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(int goal_id) {
		this.goal_id = goal_id;
	}




}
