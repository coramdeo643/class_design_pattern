package com.tenco.ch03.self;

public class Encoder {
	private EncodingStrategy encodingStrategy;
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	public String getMessage(String message) {
		return this.encodingStrategy.encode(message);
	}
}
