package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    Card card;

    @BeforeEach
    void setUp() {
        card = new Card(Suit.SPADES, "J", 10);
    }

    @Test
    void getRank() {
        assertEquals("J", card.getRank());
    }

    @Test
    void getValue() {
        assertEquals(10, card.getValue());
    }
}