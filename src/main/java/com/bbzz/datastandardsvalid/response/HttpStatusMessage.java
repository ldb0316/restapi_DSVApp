package com.bbzz.datastandardsvalid.response;

import org.springframework.http.HttpStatus;

/**
 * <pre>
 * Http 코드 별 메세지 안내를 위한 enum 클래스
 * </pre>
 * 
 * @author bbzz
 * @since 2024.05.23
 * @version 1.0
 * @see
 * 
 */
public enum HttpStatusMessage {
	
	OK(HttpStatus.OK, "성공"),
    CREATED(HttpStatus.CREATED, "생성됨"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증 필요"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "접근 금지"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "찾을 수 없음"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "내부 서버 오류");

    private final HttpStatus statusCode;
    private final String message;

    HttpStatusMessage(HttpStatus statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
