package com.application.sims4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.application.sims4.service.ServiceCategoryPack;
import com.application.sims4.service.dto.CategoryPackDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryPackController {
	
	@Autowired(required = true)
	private ServiceCategoryPack serviceCategoryPack;
	
	@GetMapping
	public List<CategoryPackDto> getAllByLibelle() {
		return serviceCategoryPack.getAll();
	}
	
	@GetMapping("{id}")
	public CategoryPackDto getById(@PathVariable Integer id) {
		CategoryPackDto cat = serviceCategoryPack.getById(id);
		if (cat == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return cat;
	}
	
	@PostMapping
	public CategoryPackDto add(@RequestBody @Valid CategoryPackDto categorieDto) {
		return serviceCategoryPack.addCategorie(categorieDto);
	}
	
    @GetMapping("/count")
    public int countCategories() {
        return serviceCategoryPack.countCategories();
    }

}
