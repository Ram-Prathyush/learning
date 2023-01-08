package com.ram;

class Animal{
public void animalSound (){
	System.out.println("All the animal make a sound");
}
}

class Dog extends Animal{
	public void animalSound() { 
	super.animalSound();
	System.out.println("Sound of dog: dow dow");
}

}

public class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.animalSound();
	}
}


