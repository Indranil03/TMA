package com.tma.entities.dao;

import java.util.List;

import com.tma.db.model.Mother;

public interface MotherDAO {
	
	List<Mother> getMother(Integer id);
	
}
