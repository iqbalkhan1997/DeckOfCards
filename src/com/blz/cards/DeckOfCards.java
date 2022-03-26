package com.blz.cards;

public class DeckOfCards implements IDeckOfCards{
    public String[] deck = new String[SIZE_OF_CARDS];

    public void initializing() {
        for (int i = 0; i < deck.length; i++) {

            String unique = RANKS[i % 13] + " Of "+ SUITS[i / 13];
            if(deck[i] == null){
                deck[i] = unique;
            } else  {

            }
        }
    }

    public void print() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }

}
