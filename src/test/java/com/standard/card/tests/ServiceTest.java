package com.standard.card.tests;

import com.standard.card.services.CardsDeck;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServiceTest {

    /**
     * Properties
     */
    private static final int DECK_SIZE = 52;

    /**
     * Initialize dependencies on test execution
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        CardsDeck.getDeck(DECK_SIZE);
    }

    /**
     * Testing deck shuffling capability.
     */
    @Test
    public void getDeckTest(){
        System.out.println("\n" + CardsDeck.getDeck());
        Assert.assertNotNull("List is not null ", CardsDeck.getDeck());
    }
}
