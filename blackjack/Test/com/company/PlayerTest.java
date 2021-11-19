package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player1, player2;
    Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
        player1 = new Player("p1");
        player2 = new Player("p2");
    }

    @Test
    void showHand() {
        player1.receiveCard(deck.draw());
        player1.receiveCard(deck.draw());
        assertEquals(21,player1.showHand());
    }

    @Test
    void receiveCard() {
        player1.receiveCard(new Card(Suit.HEARTS, "5", 5));
        assertEquals(5,player1.showHand());
    }

    @Test
    void getId() {
        assertEquals("p1", player1.getId());
    }
}