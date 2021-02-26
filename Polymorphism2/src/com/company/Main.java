package com.company;

class movie{
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }
}

class Jaws extends movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "shark eats people";
    }
}

class IndependenceDay extends movie{
    @Override
    public String plot() {
        return "Aliens attempt to take oover";
    }

    public IndependenceDay() {
        super("Independence Day");

    }
}

class MazeRunner extends movie{
    @Override
    public String plot() {
        return "kids try to escape maze";
    }

    public MazeRunner(String name) {
        super("Maze Runner");

    }
}
class StarWars extends movie{
    public StarWars(String name) {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "something something light savers.";
    }
}
class ForgettableMovie extends movie{
    public ForgettableMovie(String name) {
        super("forgettable");
    }
    //no plot method.
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5 +1);
        System.out.println("random number was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return Jaws();
                case 2
        }
    }

}
