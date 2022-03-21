package com.blz.cards;

import java.util.*;

public class DeckOfCards {
    public ArrayList <String> cardsDeck = new ArrayList<String>();
    public ArrayList <String> makeADeck(){
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
        int numOfCards = suits.length * ranks.length;

        System.out.println("Number of cards in the deck:" + numOfCards);

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardsDeck.add(ranks[i] + " Of -->" + suits[j]);
            }
        }
    print(cardsDeck);
        return cardsDeck;
    }

    public void print(ArrayList<String> cardsDeck) {
        System.out.println("Cards in Deck:");
        for (String element : cardsDeck) {
            System.out.print("\n" + element);
        }
    }

}
