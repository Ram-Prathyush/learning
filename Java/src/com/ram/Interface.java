package com.ram;

interface Animals{
	public void animalSound();
	public void animalSleep();
}
class Pig implements Animals{
	@Override
	public void animalSound() {
		System.out.println("Pig says:WeeWee");
	}
	@Override
	public void animalSleep() {
		System.out.println("Animal sleeping: ZzzZzzZzz");
		
	}
	
}

public class Interface {
	public static void main(String[] args) {
		Pig myPig = new Pig ();
		myPig.animalSound();
		
		myPig.animalSleep();
			
	}

}
