# 기능요구사항 정의중 (~ 2024.05.24)
  
## 메인페이지
- 연결된 데이터베이스의 테이블 갯수 조회

## CMM Service
- 테이블 목록
- 칼럼 목록

## 표준검증
- 표준용어 및 단어 적합여부 검증 
  - 물리칼럼명, 논리명 vs 표준용어사전 비교
- 표준도메인 적합여부 검증 
  - 데이터타입 vs 표준도메인정의서 비교

## 표준교정
- 부적합 테이블 목록 조회
- 부적합 테이블 상세 조회
- 부적합 칼럼 목록조회 
  - 부적합 유형: 용어, 도메인, 물리명 중복, 논리명 중복
- 부적합 칼럼의 물리칼럼명 변경 교정 정보 지정
- 부적합 칼럼의 논리칼럼명 변경 교정 정보 지정
- 부적합 칼럼의 새로운 물리 및 논리칼럼명 정의 정보 지정 
  - 표준정보에 추가
- 부적합 칼럼 교정 시, 자동 매핑
- 테이블 별 교정 정보 저장
- 테이블 별 교정 정보 초기화
- 데이터 교정 
  - 체크한 테이블들만 교정 가능하도록

## 매핑관리
- AS-IS DB, TO-BE DB 테이블 목록 조회 
  - 매핑 완료 여부 함께 조회
- AS-IS 테이블 상세 조회 
  - 매핑은 AS-IS에서만 가능하게 함
- AS-IS 테이블 칼럼 목록 조회
- TO-BE 테이블 정보 지정 
  - 1:n으로 지정 가능하게 해야 함
- 칼럼 자동 매핑 
  - 지정한 테이블에 같은 물리칼럼명을 가지는 칼럼끼리 자동 매핑
- TO-BE 칼럼 매핑 지정
- TO-BE 칼럼 매핑 지정 시 예외 상황 알림
  - 데이터 타입(도메인)이 서로 다르거나
  - 도메인은 같으나 TO-BE 데이터 길이가 AS-IS보다 짧아서 수용하지 못하는 경우
  - TO-BE가 NULL 불가인데 AS-IS는 NULL 가능인 경우
 
# 메모


#### 1. hibernate-core 5.x. 버전부터는 hibernate-entitymanager가 자체적으로 포함된다.
#### 2. hibernate-core 6.x이상 버전부터는 cubrid dialect를 제공하지 않는다. 별도로 build.gradle에 dialect(방언) 라이브러리를 명시해주어야 함
``` gradle
implementation 'org.hibernate.orm:hibernate-community-dialects'
```
#### 3. cubrid jdbc 별도 명시 필요
``` gradle
repositories {
	mavenCentral()
	maven { // CUBRID를 위한 repository 추가
		url 'https://maven.cubrid.org'
	}
}

dependencies {
    ~
	implementation 'cubrid:cubrid-jdbc:11.2.0.0035'
    ~
}

```
