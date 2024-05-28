package com.bbzz.datastandardsvalid.home.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bbzz.datastandardsvalid.home.dto.DbClassDTO;
import com.bbzz.datastandardsvalid.home.dto.TbUserMstDTO;
import com.bbzz.datastandardsvalid.home.entity.DbClassEntity;
import com.bbzz.datastandardsvalid.home.repository.DbClassRepository;
import com.bbzz.datastandardsvalid.home.repository.TbUserMstRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//@Transactional
public class DSVService {

	private final DbClassRepository dbClassRepository;
	private final TbUserMstRepository tbUserMstRepository;
	
	public List<DbClassEntity> selectDbClassList(DbClassDTO dbClassDTO) {
		List<DbClassEntity> resultList = dbClassRepository.findByIsSystemClassContains(dbClassDTO.getIsSystemClass());
		return resultList;
	}
	
	public List<TbUserMstDTO> selectUserList(DbClassDTO dbClassDTO) {
		List<TbUserMstDTO> resultList = tbUserMstRepository.findAll().stream().map(user -> TbUserMstDTO.builder().userId(user.getUserId()).userNm(user.getUserNm()).build()).collect(Collectors.toList()); 
		return resultList;
	}

}
