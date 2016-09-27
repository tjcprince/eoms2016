package com.boco.eoms.auth.module;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * token
 * @author tanjianchao
 *
 */
public class Token {
	String token;

	public Token(@JsonProperty("token") String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}