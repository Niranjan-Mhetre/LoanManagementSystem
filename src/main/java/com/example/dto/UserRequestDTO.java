package com.example.dto;


import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Role;
import com.example.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO 
{
	private String customerCode;
	
	@NotBlank(message = "First Name Required")
	@Size(min = 2,max = 20,message = "First Name Is To Large")
	private String firstName;

	@Size(max = 50,message = "Middle Name Cannot Exceed")
	private String middleName;
	
	@NotBlank(message = "Last Name Required")
	@Max(value = 20,message = "Last Name Is To Large")
	private String lastName;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid Email")
	@Size(max = 100,message = "Email cannot exceed 100 characters")
	private String email;

	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "^[6-9][0-9] {9}$",
			 message = "Mobile Number Pattern Not Matched")
	private String mobileNumber;

	@NotBlank(message = "Password Required")
	@Pattern( regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$",
			  message = "Password must contain Upper LowerCase Number and Special Character")
	private String password;
	
	@NotBlank(message = "Confirm Password Required")
	private String confirmPassword;

	@NotNull(message = "Dath of birth is required")
	@Past(message = "Date Of Birth must be in the past")
	private LocalDate dateOfBirth;

	@NotBlank(message = "Gender Required")
	private Gender gender;

	@NotBlank(message = "Aadhaar number is required")
    @Pattern(regexp = "^[2-9]{1}[0-9]{11}$",
             message = "Please enter a valid Aadhaar number")
	private String aadhaarNumber;

	@NotBlank(message = "PAN number is required")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$",
             message = "Please enter a valid PAN number")
	private String panNumber;

	@NotNull(message = "Branch is required")
    private Long branchId;

    @NotBlank(message = "Address Line 1 is required")
    @Size(max = 150)
    private String addressLine1;

    @Size(max = 150)
    private String addressLine2;

    @Size(max = 100)
    private String landmark;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "PIN Code is required")
    @Pattern(regexp = "^[1-9][0-9]{5}$",
             message = "Invalid PIN Code")
    private String pinCode;
}





