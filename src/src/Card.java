import java.util.HashMap;

public class Card {
    HashMap<String, Integer> rank = new HashMap<>();
    Suit suit;

    public Card(HashMap<String, Integer> rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
}
