package com.blz.cards;

public interface IDeckOfCards {
//    private String[] SUITS   = { "CLUBS", "DIAMOND", "HEARTS", "SPADES" };
//    private String[] RANKS  = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
//    private final int SIZE_OF_CARDS= SUITS.length * RANKS.length;
//    public String[] deck = new String[SIZE_OF_CARDS];

    public void initializing(String[] suits, String[] ranks);
    public void print();

    void print(String[] deck);
}
