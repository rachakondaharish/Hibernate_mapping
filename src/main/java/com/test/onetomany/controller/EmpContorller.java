package com.test.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.onetomany.entity.Emp;
import com.test.onetomany.entity.Goal;
import com.test.onetomany.entity.GolaComp;
import com.test.onetomany.service.TestService;

@RestController
public class EmpContorller {
	@Autowired
	private TestService testService;

	@RequestMapping(path = "/getAllEmpDetails", method = RequestMethod.GET)
	public List<Emp> getAllEmpDetails() {

		return testService.getAllEmps();
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String getWelcomeMsg() {

		return "Testing";
	}

	@RequestMapping(path = "/saveGoalDetails", method = RequestMethod.POST)
	public Goal saveData(@RequestBody Goal goal) {
		return testService.saveGoals(goal);
	}

	@RequestMapping(path = "/saveGoalCompDetails", method = RequestMethod.POST)
	public GolaComp saveGoalComp(@RequestBody GolaComp goalCmp) {
		return testService.saveGoalsComp(goalCmp);
	}

}
