package com.application.sims4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.TypeLand;

public interface TypeLandRepository extends JpaRepository<TypeLand, Integer> {
	
	TypeLand findById(int id);
	TypeLand findByLabel(String typeLandLabel);

}
