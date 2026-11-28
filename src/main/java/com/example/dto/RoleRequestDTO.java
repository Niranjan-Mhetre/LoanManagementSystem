package com.example.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.enums.RoleType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleRequestDTO 
{
	@NotNull(message = "Role is required")
	private RoleType roleName;
	
	@Size(max = 200,message = "Description cannot exceed 200 charter")
	private String description;
	
	
}
