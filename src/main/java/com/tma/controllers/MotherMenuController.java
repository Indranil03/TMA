package com.tma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.db.model.MotherMenu;
import com.tma.service.MotherMenuService;

@RestController
@RequestMapping("/locality/getMenu")
public class MotherMenuController {
	
	@Autowired
	private MotherMenuService motherMenuService;
	
	@RequestMapping(value="/{id}")
	public List<MotherMenu> getMenuByMotherId(@PathVariable Integer id){
		return motherMenuService.getMenuByMotherId(id);
	} 
}
