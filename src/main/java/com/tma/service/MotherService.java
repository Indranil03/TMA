package com.tma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.db.model.Mother;
import com.tma.entities.daoImpl.MotherRepository;

@Service
public class MotherService {

	@Autowired
	private MotherRepository motherRepository;
	
	public List<Mother>  getMotherById(Integer id){
		List<Mother>  mothers = new ArrayList<>();
		motherRepository.findByMotherId(id).forEach(mothers::add);
		return mothers;
	}
	
	public List<Mother>  getAllMothers(){
		List<Mother>  mothers = new ArrayList<>();
		motherRepository.findAll().forEach(mothers::add);
		return mothers;
	}
}
