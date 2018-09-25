package com.tma.entities.daoImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tma.db.model.MotherMenu;

@Repository
public interface MotherMenuRepository extends JpaRepository<MotherMenu, Integer> {
	
	public List<MotherMenu> findByMotherMotherId(Integer id);

}
