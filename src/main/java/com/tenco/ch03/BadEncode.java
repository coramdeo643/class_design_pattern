package com.tenco.ch03;

import java.util.Base64;

/*
 * 전략 패턴이 없는 코드 = Bad Encode
 * 문제 : 텍스트를 인코딩하는 방식이 여러가지일 때 우리는 encoder 클래스를 설계해볼수있다
 *
 */

/**
 * OCP Failed,
 * 기능 확장에 있어서는 Open, 기존코드 수정에는 Close,
 * 새로운 인코딩 형태가 추가된다면 매번 if else 구문 추가/수정해야한다,
 *
 */

class Encoder {
	public String encode(String text, String format) {
		if ("base64".equalsIgnoreCase(format)) {
			return Base64.getEncoder().encodeToString(text.getBytes());
		} else if ("append".equalsIgnoreCase(format)) {
			return "ABC: " + text;
		} else {
			return text;
		}
	}
}

// client class
public class BadEncode {
	public static void main(String[] args) {
		Encoder encoder = new Encoder();
		String message = "Hello, Java";
		System.out.println(encoder.encode(message, "base64"));
		System.out.println(encoder.encode(message, "append"));
	}
}
