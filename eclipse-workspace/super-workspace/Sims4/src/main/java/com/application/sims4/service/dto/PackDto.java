package com.application.sims4.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PackDto {
	private Integer id;
	
	@JsonProperty("Pack")
	private String name;
	
	@JsonProperty("categoryPackLabel")
	private String categoryPackLabel;

}
