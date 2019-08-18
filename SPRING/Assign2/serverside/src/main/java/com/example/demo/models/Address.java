package com.example.demo.models;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@Embeddable
public class Address {
	
	private String cityName;
	private String StreetName;
	private long pinCode;
	

}
