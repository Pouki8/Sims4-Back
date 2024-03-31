package com.application.sims4.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class World {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String image;
	
	@NonNull
	private String icon;
	
	@NonNull
	private String content;
	
	@NonNull
	@ManyToOne
	private Pack pack;
	
	@OneToMany(mappedBy = "world", cascade = CascadeType.ALL)
	private List<Neighborhood> neighborhood;
	
}
