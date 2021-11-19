package com.company;
import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    Set<Player> players = new HashSet<>();
    Deck deck;
    Boolean foundWinner = false;

    public Game(Set<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
        deck.shuffle();
    }

    public void assignCards(){
        for (Player player: players) {
            for(int i = 0; i < 2; i++){
                Card card = this.deck.draw();
                player.receiveCard(card);
                System.out.println("Player with the id of " + player.getId() + " was given the card: ");
                System.out.println("Suit: " + card.getSuit() + ", Rank: " + card.getRank() + ", Value: " + card.getValue());
                System.out.println("\n");
            }
        }
    }

//    Game ends:
//    1. All players stick
//    2. Any player hits 21 exactly
//    3. There is only one player left in the game because all others have gone bust

    public void playGame(){
        List<Player> stickList = new ArrayList<>();
        while (!players.isEmpty()){
            for (Player player: players) {
                if(player.showHand() < 17){
                    Card card = this.deck.draw();
                    player.receiveCard(card);
                    System.out.println("Player with the id of " + player.getId() + " was given the card: ");
                    System.out.println("Suit: " + card.getSuit() + ", Rank: " + card.getRank() + ", Value: " + card.getValue());
                    players.add(player);
                }else if(player.showHand() == 17 || player.showHand() > 17){
                    stickList.add(player);
                    players.remove(player);
                }else if(player.showHand() > 21){
                    players.remove(player);
                }else if(player.showHand() == 21){
                    System.out.println("The player with the ID of " + player.getId() + " won the game");
                    break;
                }
            }
        }

        int highest = 0;
        if(!stickList.isEmpty()){
            highest = stickList.stream().mapToInt(player -> player.showHand()).max()
            for (Player player: stickList) {
                if(player.showHand() > highest){
                    highest = player.showHand();
                }
            }
        }
    }
}
//1 = (5 + 2) = 7  || + 8 = 15  ||              || + 10 = 25 || => removed
//2 = (5 + 6) = 11 || + 11 = 22 || => removed
//3 = (3 + 2) = 5  || + 9 = 14  ||              || + 3 = 17  ||

//1 = (5 + 8) = 13  || + 5 = 18 ||  => stick
//2 = (4 + 6) = 10  || + 9 = 19 ||  => stick
//3 = (2 + 7) = 9   || + 8 = 17 ||  =>  stick

