package com.tma.entities.daoImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tma.db.model.Mother;

@Repository
public interface MotherRepository extends JpaRepository<Mother, Integer>{
	
	public List<Mother> findByMotherId(Integer id);

}
