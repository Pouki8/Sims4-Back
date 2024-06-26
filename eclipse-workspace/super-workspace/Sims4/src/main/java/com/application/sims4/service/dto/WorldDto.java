package com.application.sims4.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WorldDto {
	private Integer id;
	
	@JsonProperty("WorldName")
	private String name;
	
	@JsonProperty("ImageWorld")
	private String image;
	
	@JsonProperty("iconWorld")
	private String icon;
	
	@JsonProperty("descriptionWorld")
	private String content;
	
	@JsonProperty("packName")
	private String packName;

}
