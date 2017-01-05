package br.com.maladireta.service.exception;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public enum ExceptionConstants {

	PARAMETER_VALUE_EXCEPTION(HttpStatus.BAD_REQUEST, 4001, "Valor do parâmetro"),

	SECURITY_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, 5000, "Erro gerado por problemas de segurança, localize o administrador."),

	SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, 5001, "Erro de servidor, localizar o administrador. [%s]");

	private final HttpStatus httpStatus;

	private final Integer serverCode;

	private final String message;

	private static final Map<Integer, ExceptionConstants> internalCodeMap;

	static {
		internalCodeMap = new HashMap<Integer, ExceptionConstants>();

		for (ExceptionConstants value : values()) {
			internalCodeMap.put(value.serverCode, value);
		}
	}

	private ExceptionConstants(HttpStatus httpStatus, Integer serverCode, String message) {
		this.httpStatus = httpStatus;
		this.serverCode = serverCode;
		this.message = message;
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public ExceptionConstants parser(int code) {
		return internalCodeMap.get(code);
	}

}