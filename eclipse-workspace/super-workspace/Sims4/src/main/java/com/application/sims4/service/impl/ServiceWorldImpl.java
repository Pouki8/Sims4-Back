package com.application.sims4.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.application.sims4.model.World;
import com.application.sims4.repository.WorldRepository;
import com.application.sims4.service.ServiceWorld;
import com.application.sims4.service.dto.WorldDto;

public class ServiceWorldImpl implements ServiceWorld {
	
	@Autowired
	private WorldRepository worldRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<WorldDto> getAll() {
		List<World> world = worldRepo.findAll();
		List<WorldDto> listeWorld = world.stream().map(w -> modelMapper.map(w, WorldDto.class)).collect(Collectors.toList());		
		return listeWorld;
	}

	@Override
	public WorldDto getById(Integer id) {
		return modelMapper.map(worldRepo.findById(id), WorldDto.class);
	}

	@Override
	public WorldDto addPack(WorldDto worldDto) {
		World worldModel = modelMapper.map(worldDto, World.class);
		return modelMapper.map(worldRepo.save(worldModel), WorldDto.class);
	}

}
