package com.tma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.db.model.MotherMenu;
import com.tma.entities.daoImpl.MotherMenuRepository;

@Service
public class MotherMenuService {

	@Autowired
	private MotherMenuRepository motherMenuRepository;
	
	public List<MotherMenu>  getMenuByMotherId(Integer id){
		List<MotherMenu>  mothersMenu = new ArrayList<>();
		motherMenuRepository.findByMotherMotherId(id).forEach(mothersMenu::add);
		return mothersMenu;
	}
}
