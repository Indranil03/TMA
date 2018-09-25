package com.tma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.db.model.Mother;
import com.tma.service.MotherService;

@RestController
@RequestMapping("/locality/getMother")
public class MotherController {

	@Autowired
	private MotherService motherService;
	
	@RequestMapping(value="/{id}")
	public List<Mother> getMotherById(@PathVariable Integer id){
		return motherService.getMotherById(id);
	} 
	
	@RequestMapping(value="/all")
	public List<Mother> getAllMothers(){
		return motherService.getAllMothers();
	} 
	
}
