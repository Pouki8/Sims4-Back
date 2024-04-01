package com.application.sims4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String size;
	
	@NonNull
	private Integer price;
	
	@NonNull
	@ManyToOne
	private TypeLand typeLand;
	
	@NonNull
	@ManyToOne
	private Neighborhood neighborhood;


}
