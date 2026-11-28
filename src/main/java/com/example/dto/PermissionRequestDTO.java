package com.example.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.enums.ModuleType;
import com.example.enums.PermissionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionRequestDTO 
{
	@NotNull(message = "Permission name is required")
	private PermissionType permissionName;
	
	@NotNull(message = "Module name required")
	private ModuleType moduleName;

	@Size(max = 250,message = "Description cannot exceed 250 character")
	private String description;
	
}
