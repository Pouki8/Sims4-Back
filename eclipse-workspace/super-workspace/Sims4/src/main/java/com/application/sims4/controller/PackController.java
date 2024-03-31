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

import com.application.sims4.service.ServicePack;
import com.application.sims4.service.dto.PackDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/pack")
public class PackController {
	
	@Autowired(required = true)
	private ServicePack servicePack;
	
	@GetMapping
	public List<PackDto> getAllByLibelle() {
		return servicePack.getAll();	
	}
	
	@GetMapping("/{id}")
	public PackDto getById(@PathVariable Integer id) {
		PackDto pack = servicePack.getById(id);
		if (pack == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return pack;
	}
	
	@PostMapping
	public PackDto add(@RequestBody @Valid PackDto categorieDto) {
		return servicePack.addPack(categorieDto);
	}
	
    @GetMapping("/count")
    public int countPack() {
        return servicePack.countPack();
    }

}
