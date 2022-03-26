package com.blz.cards;

public interface IDeckOfCards {
    public String[] SUITS   = { "CLUBS", "DIAMOND", "HEARTS", "SPADES" };
    public String[] RANKS  = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    public final int SIZE_OF_CARDS= SUITS.length * RANKS.length;

    public void initializing();
    public void print();

}
