package com.bbzz.datastandardsvalid.home.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbzz.datastandardsvalid.home.model.Test;
import com.bbzz.datastandardsvalid.response.CmmResponse;
import com.bbzz.datastandardsvalid.response.CmmResponseBody;


@RestController
@RequestMapping("/home")
public class DSVController {
	
//	@GetMapping("/main")
//	public ResponseEntity<CmmResponseBody> getHomeInfo(@RequestParam(name = "param", required = false) String param) {
//
//		List<Test> tList = new ArrayList<>();
//		for(int i = 0 ; i < 10 ; i++) {
//			Test t = new Test();
//			t.setAge("21");
//			t.setEmail("abc@babaaba.com");
//			t.setName(Integer.toString(i) + "번째 LDB입니다.");
//			tList.add(t);
//		}
//		
//		CmmResponseBody crBody = CmmResponse.builder()
//										 .resultCode("00")
//										 .resultData(tList)
//										 .build()
//										 .getBody();
//		
//		return ResponseEntity.status(HttpStatus.OK).body(crBody);
//	}
	@GetMapping("/main")
	public ResponseEntity<CmmResponseBody> getHomeInfo(@RequestParam(name = "param", required = false) String param) {
		
		List<Test> tList = new ArrayList<>();
		for(int i = 0 ; i < 10 ; i++) {
			Test t = new Test();
			t.setAge("21");
			t.setEmail("abc@babaaba.com");
			t.setName(Integer.toString(i) + "번째 LDB입니다.");
			tList.add(t);
		}
		
		CmmResponseBody crBody = CmmResponse.builder()
				.resultCode("00")
				.resultMessage("정상 응답")
				.resultData(tList)
				.build()
				.getBody();
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(crBody);
//		return ResponseEntity.status(HttpStatus.OK).
	}
	
//	@GetMapping("valid")
//	public String getValidResult(@RequestParam(name = "param", required = false) String param) {
//		return "validResult";
//	}
	
	@PatchMapping("/doValid")
	public ResponseEntity<Test> doValid(@RequestBody Test test) {
		
		test.setName("anonymous");
		
		return ResponseEntity.status(HttpStatus.OK).body(test);
		
	}
	
}
