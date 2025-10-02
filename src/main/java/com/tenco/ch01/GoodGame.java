package com.tenco.ch01;

import java.util.Scanner;

// Client Object
public class GoodGame {
	public static void main(String[] args) {
		CharacterFactory factory = new CharacterFactory();
		System.out.println("Choose your character : ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		try {
			// Client is just needed to request to factory,
			// No need to know the detail logic of factory,
			// No need to fix GoodGame code,
			// Only factory could be fixed
			Character character = factory.createCharacter(choice);
			character.attack();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
