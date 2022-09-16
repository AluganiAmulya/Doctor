package com.springboot.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  

public class DoctorController {
	 
		@Autowired  
		private IDoctorService doctorService;  
  
		@GetMapping(value = "/doctor")
		 public List<Doctor> getDoctor()   
		{  
		 
		List<Doctor> doctors = doctorService.findAll();  
 
		return doctors;  
		}  
		}  
		

