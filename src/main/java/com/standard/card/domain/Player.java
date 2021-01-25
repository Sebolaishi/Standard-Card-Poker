package com.standard.card.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Model object to store player number and the their set of cards.
 */
public class Player implements Serializable {

    private int id;

    private List<String> playerCards;

    public Player() {
    }

    private Player(int id, List<String> playerCards) {
        this.id = id;
        this.playerCards = playerCards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<String> playerCards) {
        this.playerCards = playerCards;
    }
}
