package com.company;

public class Main {

			public static void main(String[] args) {
					Dog dog = new Dog("Jack");
					dog.breath();
					dog.eat();

					Parrot parrot = new Parrot("Parrot");
					parrot.breath();
					parrot.eat();
					parrot.fly();

					Penguin penguin = new Penguin("conqueror");
					penguin.eat();
					penguin.breath();
					penguin.fly();
    }
}
