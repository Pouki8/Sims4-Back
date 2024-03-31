package com.application.sims4.service;

import java.util.List;

import com.application.sims4.service.dto.WorldDto;

public interface ServiceWorld {
	
	List<WorldDto> getAll();
	
	WorldDto getById(Integer id);
	
	WorldDto addPack(WorldDto packDto);

}
