package com.tenco.ch03.step01;

/**
 * Strategy Pattern?
 * Encapsulate the method,
 * Allow change of the strategy dynamically,
 * 특정 기능을 수행할 여러 방법이 있을 때,
 * 그 방법들을 정의(클래스)하고,
 * 필요에 따라서 적절한 전략을 선택해서 사용가능
 */
public interface EncodingStrategy {
	String encode(String text);
}
