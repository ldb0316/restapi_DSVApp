package com.bbzz.datastandardsvalid.home.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;

@Entity
@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="tb_user_mst", schema = "fsmsusr")
public class TbUserMstEntity {


	/** 주소 */
	@Column(length=128)
	private String addr1; 
	

	/** 주소2 */
	@Column(length=128)
	private String addr2; 
	

	/** 인증서키번호 */
	@Column(length=50)
	private String authkeyid; 
	

	/** 부서코드 */
	@Column(length=3)
	private String deptCd; 
	

	/** 부서명 */
	@Column(length=40)
	private String deptNm; 
	

	/** 이메일 */
	@Column(length=30)
	private String email; 
	

	/** 팩스번호 */
	@Column(length=24)
	private String faxNo; 
	

	/** 직급코드 */
	@Column(length=3)
	private String grdCd; 
	

	/** 직급 */
	@Column(length=40)
	private String grdNm; 
	

	/** 입력일시 */
	@Column
	private LocalDateTime inputDt; 
	

	/** 입력ID */
	@Column(length=40)
	private String inputId; 
	

	/** IP주소 */
	@Column(length=500)
	private String ipAddress; 
	

	/** IS_PWD_CHANGE */
	@Column(length=1)
	private String isPwdChange; 
	

	/** 발급일자 */
	@Column
	private LocalDateTime issuedDt; 
	

	/** 최종로그인시간 */
	@Column
	private LocalDateTime lastLoginDt; 
	

	/** 로그인시도횟수 */
	@Column
	private Long loginCnt; 
	

	/** 비밀번호(변경된 암호화 적용_2016.7) */
	@Column(length=200)
	private String newPwd; 
	

	/** (신)사용자입력 */
	@Column(length=1)
	private String newyn; 
	

	/** 기관코드 */
	@Column(length=3)
	private String orgCd; 
	

	/** 기관명 */
	@Column(length=40)
	private String orgNm; 
	

	/** 핸드폰번호 */
	@Column(length=24)
	private String phoneNo; 
	

	/** 주민등록번호 */
	@Column(length=100)
	private String pidNo; 
	

	/** 비밀번호 */
	@Column(length=100)
	private String pwd; 
	

	/** 신청 종료일자 */
	@Column(length=8)
	private String reqEndDt; 
	

	/** 담당업무 */
	@Column(length=50)
	private String reqRsn; 
	

	/** 신청 시작일자 */
	@Column(length=8)
	private String reqStartDt; 
	

	/** 금지사유 */
	@Column(length=64)
	private String rstRsn; 
	

	/** 시도코드 */
	@Column(length=2)
	private String sidoCd; 
	

	/** 시도명 */
	@Column(length=40)
	private String sidoNm; 
	

	/** SMS수신동의 */
	@Column(length=1)
	private String smsReceiveYn; 
	

	/** SUB_DN */
	@Column(length=512)
	private String subDn; 
	

	/** 전화번호 */
	@Column(length=24)
	private String telNo; 
	

	/** 수정일시 */
	@Column
	private LocalDateTime updateDt; 
	

	/** 수정ID */
	@Column(length=40)
	private String updateId; 
	

	/** 사용여부 */
	@Column(length=1)
	private String useYn; 
	

	/** 사용자ID */
	@Id
	@Column(length=32, nullable = false)
	private String userId; 
	

	/** 사용자성명 */
	@Column(length=20)
	private String userNm; 
	

	/** 우편번호코드 */
	@Column(length=6)
	private String zipCd; 
	
}