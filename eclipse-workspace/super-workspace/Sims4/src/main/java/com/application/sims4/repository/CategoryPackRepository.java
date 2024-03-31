package com.application.sims4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.sims4.model.CategoryPack;

public interface CategoryPackRepository extends JpaRepository<CategoryPack, Integer> {

	CategoryPack findById(int id);
	CategoryPack findByLabel(String categoryPackLabel);
	
}
