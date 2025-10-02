package com.tenco.ch03.step01;

public class MainTest {
	public static void main(String[] args) {

		String message = "Hello, Java";
		// 요청에 따라서 인코딩 해보자
		Encoder encoder = new Encoder();

		// 1. Base64로 전략 선택
		encoder.setEncodingStrategy(new Base64Strategy());
		System.out.println(encoder.getMessage(message));
		// 2. Append로 전략 선택
		encoder.setEncodingStrategy(new AppendStrategy());
		System.out.println(encoder.getMessage(message));
		// 3. URL
		encoder.setEncodingStrategy(new UrlStrategy());
		System.out.println(encoder.getMessage(message));


	}
}
