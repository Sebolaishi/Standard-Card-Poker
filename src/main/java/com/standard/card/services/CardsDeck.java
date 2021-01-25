package com.standard.card.services;

import com.standard.card.lookup.LookUps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class CardsDeck {

    /**
     * Properties
     */
    private static List<String> suits = LookUps.getSuitList();
    private static List<String> ranks = LookUps.getRankList();
    private static int MIN_SIZE = 0;

    /**
     * Constructors
     */
    public CardsDeck() {
    }

    /**
     * Methods
     */

    /**
     * Method returns a list of cards.
     * @return deckList
     */
    public static List<String> getDeck(){

        String[] deck = new String[getDeckSize()];

        for (int i = MIN_SIZE; i < ranks.size(); i++) {
            for (int j = MIN_SIZE; j < suits.size(); j++) {
                deck[suits.size() * i + j] = ranks.get(i) + " of " + suits.get(j);
            }
        }

        List<String> deckList = Arrays.asList(deck);
        Collections.shuffle(deckList);
        return deckList;
    }

    /**
     * Method gets the cards deck size.
     * @return
     */
    private static int getDeckSize(){
        return suits.size() * ranks.size();
    }

}
