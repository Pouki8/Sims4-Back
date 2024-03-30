package com.application.sims4.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.sims4.model.CategoryPack;
import com.application.sims4.repository.CategoryPackRepository;
import com.application.sims4.service.ServiceCategoryPack;
import com.application.sims4.service.dto.CategoryPackDto;

@Service
public class ServiceCategoryPackImpl implements ServiceCategoryPack {
	
	@Autowired
	private CategoryPackRepository categoryPackRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CategoryPackDto> getAll() {
		List<CategoryPack> categories = categoryPackRepository.findAll();
		List<CategoryPackDto> listeCategories = categories.stream().map(c -> modelMapper.map(c, CategoryPackDto.class)).collect(Collectors.toList());		
		return listeCategories;

	}

	@Override
	public CategoryPackDto getById(Integer id) {
		return modelMapper.map(categoryPackRepository.findById(id), CategoryPackDto.class);
	}

	@Override
	public CategoryPackDto addCategorie(CategoryPackDto categoryDto) {
		CategoryPack categoryModel = modelMapper.map(categoryDto, CategoryPack.class);
		return modelMapper.map(categoryPackRepository.save(categoryModel), CategoryPackDto.class);
	}

	@Override
	public int countCategories() {
	       return (int) categoryPackRepository.count();
	}
}
	
	