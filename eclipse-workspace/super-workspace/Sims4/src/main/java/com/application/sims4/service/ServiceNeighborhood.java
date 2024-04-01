package com.application.sims4.service;

import java.util.List;

import com.application.sims4.service.dto.NeighborhoodDto;

public interface ServiceNeighborhood {
	
	List<NeighborhoodDto> getAll();
	
	NeighborhoodDto getById(Integer id);
	
	NeighborhoodDto addNeighborhood(NeighborhoodDto neighborhoodDto);

}
