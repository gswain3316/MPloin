package com.example.MPloin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.MPloin.DataModel.Employee;

@Repository
public interface EmplRepository extends JpaRepository<Employee, Long> {
		
}
