package com.bbzz.datastandardsvalid.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CmmResponseBody {
	
	private String resultCode;
	
	private String resultMessage;
	
	private Object resultData;
	
}
