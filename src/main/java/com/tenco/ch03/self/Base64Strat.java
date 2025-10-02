package com.tenco.ch03.self;

import java.util.Base64;

public class Base64Strat implements EncodingStrategy{
	@Override
	public String encode(String txt) {
		return Base64.getEncoder().encodeToString(txt.getBytes());
	}
}
