package com.tenco.ch03.self;

// 싱글톤 패턴으로 코드를 작성해보자
// 1. 정적 변수 선언
// 2. private 생성자 선언
// 3. public 정적 메서드를 선언
public class SingleTon {

	// 유일한 인스턴스를 저장할 변수(private)
	private static SingleTon instance;

	// 생성자를 private 선언해 주어야 한다.
	private SingleTon() {}

	// 인스턴스를 반환하는 정적 메서드를 만들어 준다(public) - 외부에서 접근 가능
	public static synchronized SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

	public static void main(String[] args) {
		// 객체를 여러개 생성해서 주소값이 같은지 비교 판단해보세요 !!!

	} // end of main
}
