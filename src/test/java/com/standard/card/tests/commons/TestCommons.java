package com.standard.card.tests.commons;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestCommons {
    /**
     * Constructors
     */
    public TestCommons() {
    }

    /**
     * Methods
     */

    /**
     * Method executes first to initialise, and dependencies
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("\n*****************Starting Tests*******************");
    }

    /**
     * Method runs last after all tests execute to print on console the message
     */
    @AfterClass
    public static void setUpAfterClass()
    {
        System.out.println("\n*****************Tests Finished*******************\n ");
    }
}
