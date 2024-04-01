package com.application.sims4.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NeighborhoodDto {
	
	private Integer id;
	
	@JsonProperty("NeighborhoodName")
	private String name;
	
	@JsonProperty("descriptionNeighborhood")
	private String content;
	
	@JsonProperty
	private String worldName;

}
