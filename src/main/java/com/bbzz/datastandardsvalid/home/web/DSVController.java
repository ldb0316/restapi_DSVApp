package com.bbzz.datastandardsvalid.home.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbzz.datastandardsvalid.home.dto.DbClassDTO;
import com.bbzz.datastandardsvalid.home.service.DSVService;
import com.bbzz.datastandardsvalid.response.CmmResponse;
import com.bbzz.datastandardsvalid.response.CmmResponseBody;
import com.bbzz.datastandardsvalid.response.HttpStatusMessage;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor //Service에 생성자 주입 방식으로 의존성 주입받기위해 추가
@RequestMapping("/home")
public class DSVController {
	
	private final DSVService dsvService;
	
	@GetMapping("/main")
//	public ResponseEntity<CmmResponseBody> getHomeInfo(@RequestParam(name = "param", required = false) String param) {
	public ResponseEntity<CmmResponseBody> getHomeInfo(@ModelAttribute DbClassDTO dbClassDTO) {
		
		/** 테스트 데이터 */
		List<DbClassDTO> dtoList = new ArrayList<>();
		for(int i = 0 ; i < 10 ; i++) {
			DbClassDTO dto = new DbClassDTO();
			dto.setClassName("gd");
			dto.setComment(Integer.toString(i) + "번째 LDB입니다.");
			dtoList.add(dto);
		}
		/** 테스트 데이터 */
		
//		dsvService.selectList(dbClassDTO);
		
		return CmmResponse.builder()
				.status(HttpStatusMessage.OK) //개발 과정에서 status만 컨트롤하면 자동으로 메세징 처리 되도록 구성
				.resultData(dtoList)
				.build()
				.getEntity();
	}
	
	@PatchMapping("/doValid")
	public ResponseEntity<DbClassDTO> doValid(@RequestBody DbClassDTO dto) {
		
		dto.setClassName("gd");
		
		return ResponseEntity.status(HttpStatus.OK).body(dto);
		
	}
	
}
