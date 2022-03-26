package com.blz.cards;

import java.util.ArrayList;

public class CardsMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Deck Of Cards Program.");
        DeckOfCards deckOfCard = new DeckOfCards();
        ArrayList<String> make = deckOfCard.makeADeck();

        int player = Players.players();
        Players.sequenceOfPlay(player);
        deckOfCard.shuffle(make);

    }
}
