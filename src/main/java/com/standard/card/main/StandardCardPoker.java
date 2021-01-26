package com.standard.card.main;

import com.standard.card.Exceptions.ExceptionManager;
import com.standard.card.services.Messages;

import java.util.Scanner;

/**
 * Five Card Poker Draw main class
 */
public class StandardCardPoker extends ExceptionManager implements Messages {

    /**
     * Application entry point starts here.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME);

        System.out.println(GAME_START_USER_PROMPT);
        scanner.nextLine();
        System.out.println(GAME_START);

        System.out.println("Please enter the number of players");
        String playersNumber = scanner.next();

    }
}
