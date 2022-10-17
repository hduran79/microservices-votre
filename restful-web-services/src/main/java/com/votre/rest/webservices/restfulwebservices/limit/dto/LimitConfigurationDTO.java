package com.votre.rest.webservices.restfulwebservices.limit.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfigurationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int maximun;
	private int minimum;
}
