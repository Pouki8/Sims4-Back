package com.application.sims4.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.sims4.model.Pack;
import com.application.sims4.repository.PackRepository;
import com.application.sims4.service.ServicePack;
import com.application.sims4.service.dto.PackDto;

@Service
public class ServicePackImpl implements ServicePack {
	
	@Autowired 
	private PackRepository packRepo;
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public List<PackDto> getAll() {
		List<Pack> pack = packRepo.findAll();
		List<PackDto> listePack = pack.stream().map(c -> modelMapper.map(c, PackDto.class)).collect(Collectors.toList());		
		return listePack;
	}

	@Override
	public PackDto getById(Integer id) {
		return modelMapper.map(packRepo.findById(id), PackDto.class);
	}

	@Override
	public PackDto addPack(PackDto packDto) {
		Pack packModel = modelMapper.map(packDto, Pack.class);
		return modelMapper.map(packRepo.save(packModel), PackDto.class);
	}

	@Override
	public int countPack() {
	       return (int) packRepo.count();
	}

}
