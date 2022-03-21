package com.blz.cards;

public class DeckOfCards {

    private static final String[] SUITS = { "CLUBS", "DIAMOND", "HEARTS", "SPADES" };
    private static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    private final int SIZE_OF_CARDS= SUITS.length * RANKS.length;
    public String[] deck = new String[SIZE_OF_CARDS];


    public void initializing() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = RANKS[i % 13] + " Of "+ SUITS[i / 13];
        }
    }

    public void print() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }

}
