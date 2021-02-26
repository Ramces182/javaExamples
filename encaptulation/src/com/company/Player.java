package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;


    public void loseHelath(int damage){
        this.health = this.health - damage;
        if (this.health<=0){
            System.out.println("player knowcked out");
            //reduce lives.

        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
