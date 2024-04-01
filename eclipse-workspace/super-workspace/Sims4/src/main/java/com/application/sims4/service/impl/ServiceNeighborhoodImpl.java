package com.application.sims4.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.sims4.model.Neighborhood;
import com.application.sims4.repository.NeighborhoodRepository;
import com.application.sims4.service.ServiceNeighborhood;
import com.application.sims4.service.dto.NeighborhoodDto;

@Service
public class ServiceNeighborhoodImpl implements ServiceNeighborhood {
	
	@Autowired
	private NeighborhoodRepository neighborhoodRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<NeighborhoodDto> getAll() {
		List<Neighborhood> neighborhood = neighborhoodRepo.findAll();
		List<NeighborhoodDto> listeNeighborhood = neighborhood.stream().map(n -> modelMapper.map(n, NeighborhoodDto.class)).collect(Collectors.toList());		
		return listeNeighborhood;
	}

	@Override
	public NeighborhoodDto getById(Integer id) {
		return modelMapper.map(neighborhoodRepo.findById(id), NeighborhoodDto.class);
	}

	@Override
	public NeighborhoodDto addNeighborhood(NeighborhoodDto neighborhoodDto) {
		Neighborhood neighborhoodModel = modelMapper.map(neighborhoodDto, Neighborhood.class);
		return modelMapper.map(neighborhoodRepo.save(neighborhoodModel), NeighborhoodDto.class);
	}

}
