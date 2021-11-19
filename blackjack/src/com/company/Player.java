package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Player {
    private String id;
    private List<Card> hand = new ArrayList<>();
    private int handValue;

    public int showHand () {
        handValue = hand.stream().map(Card::getValue).reduce(0, Integer::sum);
        return handValue;
    }

    public void receiveCard(Card card){
        this.hand.add(card);
    }

    public String getId(){
        return this.id;
    }
}
