package com.example.bootlib.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("bootlib.service")
public class ServiceProperties {

	/**
	 * A message for the service.
	 */
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
