package com.bbzz.datastandardsvalid.response;

import lombok.Builder;

@Builder
public class CmmResponse {
	
	@Builder.Default
	private CmmResponseBody cmmResponseBody = new CmmResponseBody();
	
	private String resultCode;
	
	private String resultMessage;
	
	private Object resultData;
	
	public CmmResponseBody getBody() {
//		this.cmmResponseBody = new CmmResponseBody();
		this.cmmResponseBody.setResultMessage(this.resultMessage);
		this.cmmResponseBody.setResultCode(this.resultCode);
		this.cmmResponseBody.setResultData(this.resultData);
		return this.cmmResponseBody;
	}
	
//	private CmmResponse() {
//		
//	}
//	
//	private CmmResponse(CmmResponseBuilder cmmResponseBuilder) {
//		
//	}
//	
//	public static class CmmResponseBuilder {
//		
//		private String resultCode;
//		
//		@Builder
//		public CmmResponseBuilder() {}
//		
//		public CmmResponseBuilder setResultCode(String code) {
//			this.resultCode = code;
//			return this;
//		}
//		
//		public CmmResponse build() {
//			return new CmmResponse(this);
//		}
//		
//	}
}
