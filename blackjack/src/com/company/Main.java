package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();

        Player player1 = new Player("p1");
        Player player2 = new Player("p2");
        Player player3 = new Player("p3");

        Set<Player> players = new HashSet<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Game freshGame = new Game(players, deck);

        freshGame.assignCards();

//        freshGame.playGame();

    }
}
