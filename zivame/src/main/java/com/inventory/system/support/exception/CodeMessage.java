package com.inventory.system.support.exception;

import java.io.Serializable;

public class CodeMessage {
	private final int code;
	private final String message;
	
	public CodeMessage(final int code,final String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
