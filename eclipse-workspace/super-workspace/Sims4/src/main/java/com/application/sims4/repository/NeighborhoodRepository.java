package com.application.sims4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.Neighborhood;
import com.application.sims4.model.World;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Integer> {
	
	Neighborhood findById(int id);
	Neighborhood findByName(String name);
	List<Neighborhood> findByWorld(World world);

}
