package com.tenco;

/**
 * Factory Pattern?
 * No need to know the detail logic as Client,
 * Just ask the factory to build certain object,
 * Factory will produce that object as client wants,
 * Like vending machine
 */
public class CharacterFactory {

	// Design through the method
	public Character createCharacter(String type) {
		if (type.equals("Warrior")) {
			return new Warrior();
		} else if (type.equals("Magi")) {
			return new Magi();
		} else if (type.equals("Archer")) {
			return new Archer();
		} else {
			// Throwing exception is better than null
			throw new IllegalArgumentException("Invalid character type");
		}
	}
}
