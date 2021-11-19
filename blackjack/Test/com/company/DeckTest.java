package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @Test
    void shuffle() {

        String firstSnapshot = deck.getSnapShotOfListOfCards();

        deck.shuffle();

        String secondSnapshot = deck.getSnapShotOfListOfCards();

        assertNotEquals(firstSnapshot, secondSnapshot);

//        System.out.println("first snapshot\n" + firstSnapshot);
//        System.out.println("second snapshot\n" + secondSnapshot);
//
//        deck.shuffle();
//
//        System.out.println("\n" + deck.getSnapShotOfListOfCards());

    }

    @Test
    void draw() {
        Card card = new Card(Suit.HEARTS, "A", 11);
        assertEquals(card.getValue(), deck.draw().getValue());
    }
}