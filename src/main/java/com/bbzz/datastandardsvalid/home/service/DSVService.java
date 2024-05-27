package com.bbzz.datastandardsvalid.home.service;

import org.springframework.stereotype.Service;

import com.bbzz.datastandardsvalid.home.dto.DbClassDTO;
import com.bbzz.datastandardsvalid.home.repository.DbClassRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DSVService {

	private final DbClassRepository dbClassRepository;
	
	public void selectList(DbClassDTO dbClassDTO) {
		
//		dbClassRepository.count()
		
	}

}
