package com.standard.card.tests;

import com.standard.card.services.CardDraw;
import com.standard.card.services.CardsDeck;
import com.standard.card.tests.commons.TestCommons;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceTest extends TestCommons {

    /**
     * Properties
     */

    private static int players = 5;
    private static int player_cards_number = 5;
    private static List<String> deckList = new ArrayList<>();
    private static HashMap<String, List<String>> playersDeck = new HashMap<>();

    @BeforeClass
    public static void setUpBeforeClass()
    {
        deckList = CardsDeck.getDeck();
        playersDeck = CardDraw.playersCards(player_cards_number, players, deckList);
    }

    /**
     * Testing deck shuffling capability.
     */
    @Test
    public void getDeckTest(){
        System.out.println("\nDeck Size is : "  + deckList.size());
        System.out.println("\n************************************\n Cards ");
        System.out.println("************************************");
        System.out.println(" \n" + deckList);
        Assert.assertNotNull("List is not null ", deckList);
    }

    @Test
    public void getPlayersDeck(){
        System.out.println(" \n" + playersDeck.get("Player_2"));
        Assert.assertNotNull("List is not null ", playersDeck);
    }
}
