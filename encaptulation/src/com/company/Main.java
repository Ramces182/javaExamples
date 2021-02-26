package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Ram";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHelath(damage);
        System.out.println("remianing health = " + player.healthRemaining());

		damage = 11;
		player.loseHelath(damage);
		System.out.println("remianing health = " + player.healthRemaining());

		EnhancedPlayer eplayer = new EnhancedPlayer("Daniel", 200, "Shotgun");
		System.out.println("initial health is " + eplayer.getHealth());

    }
}
