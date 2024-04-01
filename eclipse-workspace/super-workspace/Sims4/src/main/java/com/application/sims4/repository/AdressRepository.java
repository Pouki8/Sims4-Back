package com.application.sims4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.Adress;
import com.application.sims4.model.Neighborhood;

public interface AdressRepository extends JpaRepository<Adress, Integer> {
	
	Adress findById(int id);
	Adress findByName(String name);
	List<Adress> findByNeighborhood(Neighborhood neighborhood);

}
