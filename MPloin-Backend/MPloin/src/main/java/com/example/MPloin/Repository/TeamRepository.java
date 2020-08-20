package com.example.MPloin.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MPloin.DataModel.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
	
	Optional<Team> findById(Long id); 
		
}
