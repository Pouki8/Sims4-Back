package com.application.sims4.service;

import java.util.List;

import com.application.sims4.service.dto.TypeLandDto;

public interface ServiceTypeLand {
	
	List<TypeLandDto> getAll();

	TypeLandDto getById(Integer id);

	TypeLandDto addCategorie(TypeLandDto typeDto);
	
	int countTypeLand();

}
