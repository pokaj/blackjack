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
                player.receiveCard(this.deck.draw());
            }
        }
    }



    public void playGame(){
        List<Player> stickList = new ArrayList<>();
        while (!players.isEmpty()){
            for (Player player: players) {
                if(player.showHand() < 17){
                    player.receiveCard(this.deck.draw());
                    players.add(player);
                }else if(player.showHand() == 17 || player.showHand() > 17){
                    stickList.add(player);
                    players.remove(player);
                }else if(player.showHand() > 21){
                    players.remove(player);
                }else if(player.showHand() == 21){
                    this.foundWinner = true;
                    System.out.println("The player with the ID of " + player.getId() + " won the game");
                }
            }
        }
    }
}
