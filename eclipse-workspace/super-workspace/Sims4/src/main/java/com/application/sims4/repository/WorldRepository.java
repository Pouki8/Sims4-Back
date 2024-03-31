package com.application.sims4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.Pack;
import com.application.sims4.model.World;

public interface WorldRepository extends JpaRepository<World, Integer> {
	
	World findById(int id);
	World findByName(String name);
	List<World> findByPack(Pack pack);
	
}
