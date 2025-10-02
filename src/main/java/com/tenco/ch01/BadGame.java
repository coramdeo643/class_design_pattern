package com.tenco;

import java.util.Scanner;

public class BadGame {

	public static void main(String[] args) {
		System.out.println("Choose your character(Warrior, Magi, Archer)");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		Character character;

		if (choice.equals("Warrior")) {
			character = new Warrior();
		} else if (choice.equals("Magi")) {
			character = new Magi();
		} else if (choice.equals("Archer")) {
			character = new Archer();
		} else {
			System.out.println("Invalid choice");
					return;
		}
		character.attack();
	}
}

/*
책임의 집중 - 게임 클래스는 게임을 진행하는 책임과 캐릭터를 생성하는 책임을 모두 가지고 있다
(단일 책임 원칙 위배)
확장의 어려움 - 신규 직업 추가시 if-else 구문 직접 수정해야함,
(개방 폐쇄 원칙 위배) 및 코드 복잡성 증가
=> Factory Pattern
 */
