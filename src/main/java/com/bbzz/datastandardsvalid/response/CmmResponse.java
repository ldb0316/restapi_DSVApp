package com.bbzz.datastandardsvalid.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Builder;

@Builder
public class CmmResponse {
	
	@Builder.Default
	private CmmResponseBody cmmResponseBody = new CmmResponseBody();
	
	private HttpStatusMessage status;
	
	private Object resultData;
	
	public ResponseEntity<CmmResponseBody> getEntity() {
		//사용자에게 보여지는 json값 세팅
		this.cmmResponseBody.setStatusMessage(this.status.getMessage()); //상태메세지
		this.cmmResponseBody.setStatusCode(this.status.getStatusCode().value()); //상태코드. 필요에 따라 커스텀(커스텀 시 HttpStatusMessage Enum 수정 필요)
		
		//상태가 정상이면 결과값을 주고, 정상이 아닐 경우에는 빈값을 리턴한다.
		if(this.status.getStatusCode().value() == HttpStatus.OK.value()) {
			this.cmmResponseBody.setResultData(this.resultData); //결과값			
		} else {
			this.cmmResponseBody.setResultData(""); //결과값
		}
		
		return ResponseEntity.status(this.status.getStatusCode()).body(this.cmmResponseBody);
	}
	
}
