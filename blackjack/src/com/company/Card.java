//import javafx.beans.binding.MapExpression;
package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Card {
    private Suit suit;
    private final String rank;
    private final int value;

//    Stack<Integer> mst = Arrays.

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
