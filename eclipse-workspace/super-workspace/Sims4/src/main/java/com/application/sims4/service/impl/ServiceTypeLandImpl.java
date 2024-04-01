package com.application.sims4.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.sims4.model.TypeLand;
import com.application.sims4.repository.TypeLandRepository;
import com.application.sims4.service.ServiceTypeLand;
import com.application.sims4.service.dto.TypeLandDto;

@Service
public class ServiceTypeLandImpl implements ServiceTypeLand {
	
	@Autowired
	private TypeLandRepository typeRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<TypeLandDto> getAll() {
		List<TypeLand> types = typeRepo.findAll();
		List<TypeLandDto> listeTypes = types.stream().map(c -> modelMapper.map(c, TypeLandDto.class)).collect(Collectors.toList());		
		return listeTypes;
	}

	@Override
	public TypeLandDto getById(Integer id) {
		return modelMapper.map(typeRepo.findById(id), TypeLandDto.class);
	}

	@Override
	public TypeLandDto addCategorie(TypeLandDto typeDto) {
		TypeLand typeModel = modelMapper.map(typeDto, TypeLand.class);
		return modelMapper.map(typeRepo.save(typeModel), TypeLandDto.class);
	}

	@Override
	public int countTypeLand() {
	       return (int) typeRepo.count();
	}

}
