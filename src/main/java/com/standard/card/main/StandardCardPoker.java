package com.standard.card.main;

import com.standard.card.Exceptions.ExceptionManager;
import com.standard.card.services.CardDraw;
import com.standard.card.services.CardsDeck;
import com.standard.card.services.Messages;
import com.standard.card.services.PrepareResults;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Five Card Poker Draw main class
 */
public class StandardCardPoker{

    /**
     * Application entry point starts here.
     * @param args
     */
    public static void main(String[] args){
        PrepareResults.getResults();
    }
}
