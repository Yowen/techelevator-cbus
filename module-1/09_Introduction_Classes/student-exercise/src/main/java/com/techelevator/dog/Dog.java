package com.techelevator.dog;

public class Dog {

	private boolean isSleeping;

	public boolean isSleeping() {
		return isSleeping;
	}
	
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping = false;
	}
	
	public String makeSound() {
		if (isSleeping == true) {
			return "Zzzzz...";
		}
		else {
			return "Woof!";
		}
	}
	
	
	
}
