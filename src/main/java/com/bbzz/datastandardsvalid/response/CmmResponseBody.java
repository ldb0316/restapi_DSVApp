package com.bbzz.datastandardsvalid.response;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CmmResponseBody {
	
	private int statusCode;
	
	private String statusMessage;
	
	private Object resultData;
	
}
