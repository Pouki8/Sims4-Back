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

import com.application.sims4.service.ServiceTypeLand;
import com.application.sims4.service.dto.TypeLandDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/type")
public class TypeLandController {
	
	@Autowired(required = true)
	private ServiceTypeLand serviceTypeLand;
	
	@GetMapping
	public List<TypeLandDto> getAllByLibelle() {
		return serviceTypeLand.getAll();
	}
	
	@GetMapping("{id}")
	public TypeLandDto getById(@PathVariable Integer id) {
		TypeLandDto type = serviceTypeLand.getById(id);
		if (type == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return type;
	}
	
	@PostMapping
	public TypeLandDto add(@RequestBody @Valid TypeLandDto typeLandDto) {
		return serviceTypeLand.addCategorie(typeLandDto);
	}
	
    @GetMapping("/count")
    public int countTypeLand() {
        return serviceTypeLand.countTypeLand();
    }

}
