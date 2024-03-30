package com.application.sims4.service;

import java.util.List;

import com.application.sims4.service.dto.CategoryPackDto;

public interface ServiceCategoryPack {
	
	List<CategoryPackDto> getAll();

	CategoryPackDto getById(Integer id);

	CategoryPackDto addCategorie(CategoryPackDto categoryDto);
	
	int countCategories();

}
