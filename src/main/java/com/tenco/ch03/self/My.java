package com.tenco.ch03.self;

public class My implements EncodingStrategy{
	@Override
	public String encode(String txt) {
		return "My: " + txt;
	}
}
