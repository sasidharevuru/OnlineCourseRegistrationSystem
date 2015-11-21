package com.osrs.login.model;

public class RegisterResponse {

	String sessionKey;
	String result;
	
	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public RegisterResponse() {
	}

	public RegisterResponse(String sessionKey, String result) {
		super();
		this.sessionKey = sessionKey;
		this.result = result;
	} 
	
}