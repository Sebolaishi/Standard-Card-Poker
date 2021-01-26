package com.standard.card.tests.commons;

import com.standard.card.services.Messages;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestCommons implements Messages {
    /**
     * Constructors
     */
    public TestCommons() {
    }

    /**
     * Methods
     */

    /**
     * Method runs last after all tests execute to print on console the message
     */
    @AfterClass
    public static void setUpAfterClass()
    {
        System.out.println(TEST_END_MESSAGE);
    }
}
