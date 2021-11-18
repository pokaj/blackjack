import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private Suit suit;
    private String rank;
    private int value;

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
