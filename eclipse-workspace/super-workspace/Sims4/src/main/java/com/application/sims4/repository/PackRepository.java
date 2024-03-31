package com.application.sims4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.Pack;


public interface PackRepository extends JpaRepository<Pack, Integer> {
	
	Pack findById(int id);
	Pack findByName(String packName);

}
