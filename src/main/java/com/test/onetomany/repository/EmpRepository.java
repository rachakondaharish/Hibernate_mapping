package com.test.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.onetomany.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
