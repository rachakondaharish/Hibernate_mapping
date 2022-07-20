package com.test.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.onetomany.entity.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {

}
