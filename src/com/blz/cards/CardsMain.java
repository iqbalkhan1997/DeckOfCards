package com.blz.cards;

public class CardsMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Deck Of Cards Program.");
        DeckOfCards deckOfCard = new DeckOfCards();
        deckOfCard.initializing();
        deckOfCard.print();
        int player = Players.players();
        Players.sequenceOfPlay(player);
    }
}
