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

import com.application.sims4.service.ServiceNeighborhood;
import com.application.sims4.service.dto.NeighborhoodDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/quartier")
public class NeighborhoodController {
	
	@Autowired(required = true)
	private ServiceNeighborhood serviceNeighborhood;
	
	@GetMapping
	public List<NeighborhoodDto> getAllByLibelle() {
		return serviceNeighborhood.getAll();	
	}
	
	@GetMapping("/{id}")
	public NeighborhoodDto getById(@PathVariable Integer id) {
		NeighborhoodDto neighborhood = serviceNeighborhood.getById(id);
		if (neighborhood == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return neighborhood;
	}
	
	@PostMapping
	public NeighborhoodDto add(@RequestBody @Valid NeighborhoodDto neighborhoodDto) {
		return serviceNeighborhood.addNeighborhood(neighborhoodDto);
	}

}
