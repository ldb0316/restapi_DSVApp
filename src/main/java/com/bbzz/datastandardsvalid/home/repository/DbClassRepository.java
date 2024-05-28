package com.bbzz.datastandardsvalid.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbzz.datastandardsvalid.home.entity.DbClassEntity;

public interface DbClassRepository extends JpaRepository<DbClassEntity, String> {
	
	List<DbClassEntity> findByIsSystemClassContains(String isSystemClass);

}
