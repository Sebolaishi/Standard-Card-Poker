package com.standard.card.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class handles players draws
 */
public class CardDraw {

    /**
     * Properties
     */

    private static final int min_size = 0;
    private static final int players_number_increment = 1;
    private static List<String> playersCards = new ArrayList<>();
    private static HashMap<String, List<String>> playersDeck = new HashMap<>();


    public CardDraw() {
    }

    /**
     * This method returns players cards at hand.
     * @param player_cards_number
     * @param players
     * @param deckList
     * @return playersDeck
     */
    public static HashMap<String, List<String>> playersCards(int player_cards_number, int players, List<String> deckList){

        for (int i = min_size; i < players; i++) {
            String player = "Player_" + (i + players_number_increment);
            playersCards.clear();
            for (int j = min_size; j < player_cards_number; j++) {
                playersCards.add(deckList.get(i + j * players));
            }
            playersDeck.put(player, playersCards);
        }
        return playersDeck;
    }



    /**
     *Getters
     */

    public static List<String> getPlayersCards() {
        return playersCards;
    }

    public static HashMap<String, List<String>> getPlayersDeck() {
        return playersDeck;
    }
}
