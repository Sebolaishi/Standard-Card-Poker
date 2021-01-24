package com.standard.card.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class CardsDeck {

    /**
     * Properties
     */
    private static List<Integer> deck = new ArrayList<>();

    /**
     * Constructors
     */
    public CardsDeck() {
    }

    /**
     * Methods
     */

    /**
     * The method takes in cards deck size and returns a list of shuffled deck.
     * @param deckSize
     * @return deck
     */
    public static List<Integer> getDeck(int deckSize){

        for (int i = 0; i < deckSize; ++i) {
            deck.add(i);
        }

        Collections.shuffle(deck);

        return deck;
    }

    /**
     *Getters And Setters
     */

    public static List<Integer> getDeck() {
        return deck;
    }

    public static void setDeck(List<Integer> deck) {
        CardsDeck.deck = deck;
    }
}
