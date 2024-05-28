package com.bbzz.datastandardsvalid.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bbzz.datastandardsvalid.home.dto.DbClassDTO;
import com.bbzz.datastandardsvalid.home.entity.DbClassEntity;
import com.bbzz.datastandardsvalid.home.repository.DbClassRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//@Transactional
public class DSVService {

	private final DbClassRepository dbClassRepository;
	
	public List<DbClassEntity> selectDbClassList(DbClassDTO dbClassDTO) {
		List<DbClassEntity> resultList = dbClassRepository.findByIsSystemClassContains(dbClassDTO.getIsSystemClass());
		return resultList;
	}

}
