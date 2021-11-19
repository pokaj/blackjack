package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {
    private final List<Card> cards = Arrays.asList(
            // DIAMONDS
            new Card(Suit.DIAMONDS, "2", 2),
            new Card(Suit.DIAMONDS, "3", 3),
            new Card(Suit.DIAMONDS, "4", 4),
            new Card(Suit.DIAMONDS, "5", 5),
            new Card(Suit.DIAMONDS, "6", 6),
            new Card(Suit.DIAMONDS, "7", 7),
            new Card(Suit.DIAMONDS, "8", 8),
            new Card(Suit.DIAMONDS, "9", 9),
            new Card(Suit.DIAMONDS, "10", 10),
            new Card(Suit.DIAMONDS, "K", 10),
            new Card(Suit.DIAMONDS, "Q", 10),
            new Card(Suit.DIAMONDS, "J", 10),
            new Card(Suit.DIAMONDS, "A", 11),

            // SPADES
            new Card(Suit.SPADES, "2", 2),
            new Card(Suit.SPADES, "3", 3),
            new Card(Suit.SPADES, "4", 4),
            new Card(Suit.SPADES, "5", 5),
            new Card(Suit.SPADES, "6", 6),
            new Card(Suit.SPADES, "7", 7),
            new Card(Suit.SPADES, "8", 8),
            new Card(Suit.SPADES, "9", 9),
            new Card(Suit.SPADES, "10", 10),
            new Card(Suit.SPADES, "K", 10),
            new Card(Suit.SPADES, "Q", 10),
            new Card(Suit.SPADES, "J", 10),
            new Card(Suit.SPADES, "A", 11),

            // CLUBS
            new Card(Suit.CLUBS, "2", 2),
            new Card(Suit.CLUBS, "3", 3),
            new Card(Suit.CLUBS, "4", 4),
            new Card(Suit.CLUBS, "5", 5),
            new Card(Suit.CLUBS, "6", 6),
            new Card(Suit.CLUBS, "7", 7),
            new Card(Suit.CLUBS, "8", 8),
            new Card(Suit.CLUBS, "9", 9),
            new Card(Suit.CLUBS, "10", 10),
            new Card(Suit.CLUBS, "K", 10),
            new Card(Suit.CLUBS, "Q", 10),
            new Card(Suit.CLUBS, "J", 10),
            new Card(Suit.CLUBS, "A", 11),

            // HEARTS
            new Card(Suit.HEARTS, "2", 2),
            new Card(Suit.HEARTS, "3", 3),
            new Card(Suit.HEARTS, "4", 4),
            new Card(Suit.HEARTS, "5", 5),
            new Card(Suit.HEARTS, "6", 6),
            new Card(Suit.HEARTS, "7", 7),
            new Card(Suit.HEARTS, "8", 8),
            new Card(Suit.HEARTS, "9", 9),
            new Card(Suit.HEARTS, "10", 10),
            new Card(Suit.HEARTS, "K", 10),
            new Card(Suit.HEARTS, "Q", 10),
            new Card(Suit.HEARTS, "J", 10),
            new Card(Suit.HEARTS, "A", 11)

    );

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw () {
        Card card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }
}

