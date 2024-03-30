package com.application.sims4.service;

import java.util.List;

import com.application.sims4.service.dto.PackDto;

public interface ServicePack {
	
	List<PackDto> getAll();
	
	PackDto getById(Integer id);
	
	PackDto addPack(PackDto packDto);

	int countPack();

}
