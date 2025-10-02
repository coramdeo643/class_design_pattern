package com.tenco.ch03.step01;

/**
 * 핵심코드 - 전략을 사용하는 주체
 */
public class Encoder {
	private EncodingStrategy encodingStrategy;

	// change the strategy dynamically
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}

	public String getMessage(String message) {
		return this.encodingStrategy.encode(message);
	}
}
