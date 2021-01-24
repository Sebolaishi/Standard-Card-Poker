package com.standard.card.tests;

import com.standard.card.services.CardsDeck;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ServiceTest {

    private static final int DECK_SIZE = 52;

    @Test
    public void getDeckTest(){
        List<Integer> deck = CardsDeck.getDeck(DECK_SIZE);
        System.out.println(deck);
        Assert.assertNotNull(deck);
    }
}
