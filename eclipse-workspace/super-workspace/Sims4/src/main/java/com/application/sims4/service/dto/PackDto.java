package com.application.sims4.service.dto;

import java.util.List;

import com.application.sims4.model.World;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PackDto {
	private Integer id;
	
	@JsonProperty("Pack")
	private String name;
	
	private List<World> world;

}
