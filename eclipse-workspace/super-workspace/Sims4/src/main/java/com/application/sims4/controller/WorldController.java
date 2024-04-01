package com.application.sims4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.application.sims4.service.ServiceWorld;
import com.application.sims4.service.dto.WorldDto;


@RestController
@RequestMapping("/world")
public class WorldController {
	
	@Autowired(required = true)
	private ServiceWorld serviceWorld;
	
	@GetMapping
	public List<WorldDto> getAllByLibelle() {
		return serviceWorld.getAll();	
	}
	
	@GetMapping("/{id}")
	public WorldDto getById(@PathVariable Integer id) {
		WorldDto world = serviceWorld.getById(id);
		if (world == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return world;
	}
	
	@PostMapping
	public WorldDto addWorld(WorldDto worldDto) {
		return serviceWorld.addWorld(worldDto);
	}

}
