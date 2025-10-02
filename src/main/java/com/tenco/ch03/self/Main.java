package com.tenco.ch03.self;

public class Main {
	public static void main(String[] args) {
		String message = "Hello, Java";
		Encoder encoder = new Encoder();

		encoder.setEncodingStrategy(new Base64Strat());
		System.out.println(encoder.getMessage(message));

	}
}
