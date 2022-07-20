package com.test.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.onetomany.entity.GolaComp;

@Repository
public interface GoalCompRepository extends JpaRepository<GolaComp, Integer> {

}
