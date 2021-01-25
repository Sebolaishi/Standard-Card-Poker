package com.standard.card.tests;

import com.standard.card.services.CardsDeck;
import com.standard.card.tests.commons.TestCommons;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class ServiceTest extends TestCommons {

    /**
     * Properties
     */

    /**
     * Testing deck shuffling capability.
     */
    @Test
    public void getDeckTest(){
        System.out.println("\nDeck Size is : "  + CardsDeck.getDeck().size());
        System.out.println("\n************************************\n Cards ");
        System.out.println("************************************");
        System.out.println(" \n" + CardsDeck.getDeck());
        Assert.assertNotNull("List is not null ", CardsDeck.getDeck());
    }
}
