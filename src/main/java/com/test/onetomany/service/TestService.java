package com.test.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.onetomany.entity.Emp;
import com.test.onetomany.entity.Goal;
import com.test.onetomany.entity.GolaComp;
import com.test.onetomany.repository.EmpRepository;
import com.test.onetomany.repository.GoalCompRepository;
import com.test.onetomany.repository.GoalRepository;

@Service
public class TestService {
	@Autowired
	private EmpRepository empRepository;

	@Autowired
	private GoalRepository goalRepository;
	
	@Autowired
	private GoalCompRepository goalCompRepository;

	public List<Emp> getAllEmps() {
		return empRepository.findAll();
	}

	public Goal saveGoals(Goal goal) {
		return goalRepository.save(goal);
	}
	
	
	public GolaComp saveGoalsComp(GolaComp goalComp) {
		return goalCompRepository.save(goalComp);
	}

}
