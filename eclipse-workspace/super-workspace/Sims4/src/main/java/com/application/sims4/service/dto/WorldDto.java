package com.application.sims4.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorldDto {
	
	private Integer id;
	
	@JsonProperty("World")
	private String name;

}
