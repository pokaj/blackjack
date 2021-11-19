//import javafx.beans.binding.MapExpression;
package com.company;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private Suit suit;
    private final String rank;
    private final int value;

    public Card(Suit suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
}
