package com.bbzz.datastandardsvalid.home.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbUserMstDTO {

	/** 주소 */
	private String addr1; 
	

	/** 주소2 */
	private String addr2; 
	

	/** 인증서키번호 */
	private String authkeyid; 
	

	/** 부서코드 */
	private String deptCd; 
	

	/** 부서명 */
	private String deptNm; 
	

	/** 이메일 */
	private String email; 
	

	/** 팩스번호 */
	private String faxNo; 
	

	/** 직급코드 */
	private String grdCd; 
	

	/** 직급 */
	private String grdNm; 
	

	/** 입력일시 */
	private LocalDateTime inputDt; 
	

	/** 입력ID */
	private String inputId; 
	

	/** IP주소 */
	private String ipAddress; 
	

	/** IS_PWD_CHANGE */
	private String isPwdChange; 
	

	/** 발급일자 */
	private LocalDateTime issuedDt; 
	

	/** 최종로그인시간 */
	private LocalDateTime lastLoginDt; 
	

	/** 로그인시도횟수 */
	private Long loginCnt; 
	

	/** 비밀번호(변경된 암호화 적용_2016.7) */
	private String newPwd; 
	

	/** (신)사용자입력 */
	private String newyn; 
	

	/** 기관코드 */
	private String orgCd; 
	

	/** 기관명 */
	private String orgNm; 
	

	/** 핸드폰번호 */
	private String phoneNo; 
	

	/** 주민등록번호 */
	private String pidNo; 
	

	/** 비밀번호 */
	private String pwd; 
	

	/** 신청 종료일자 */
	private String reqEndDt; 
	

	/** 담당업무 */
	private String reqRsn; 
	

	/** 신청 시작일자 */
	private String reqStartDt; 
	

	/** 금지사유 */
	private String rstRsn; 
	

	/** 시도코드 */
	private String sidoCd; 
	

	/** 시도명 */
	private String sidoNm; 
	

	/** SMS수신동의 */
	private String smsReceiveYn; 
	

	/** SUB_DN */
	private String subDn; 
	

	/** 전화번호 */
	private String telNo; 
	

	/** 수정일시 */
	private LocalDateTime updateDt; 
	

	/** 수정ID */
	private String updateId; 
	

	/** 사용여부 */
	private String useYn; 
	

	/** 사용자ID */
	private String userId; 
	

	/** 사용자성명 */
	private String userNm; 
	

	/** 우편번호코드 */
	private String zipCd; 
	
}