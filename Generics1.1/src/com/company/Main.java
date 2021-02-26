package com.company;

public class Main {

    public static void main(String[] args) {
        FutballPlayer joe = new FutballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team <FutballPlayer> adelaideCrows = new Team<>("AdelaideCrows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(beckham);


    }
}
