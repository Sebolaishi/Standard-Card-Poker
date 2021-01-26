package com.standard.card.services;

import com.standard.card.Exceptions.ExceptionManager;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrepareResults extends ExceptionManager implements Messages  {

    public static void getResults(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME);

        System.out.println(GAME_START_USER_PROMPT);
        scanner.nextLine();
        System.out.println(GAME_START);

        System.out.println(PLAYERS_NUMBER);
        String playersNumberInput = scanner.next();

        System.out.println(CARDS_NUMBER);
        String playersCardsInput = scanner.next();
        HashMap<String, List<String>> playersDeck =
                CardDraw.playersCards(validatePlayerInput(playersCardsInput, scanner),validatePlayerInput(playersNumberInput, scanner), CardsDeck.getDeck());

        System.out.println(CARDS_SHUFFLE);
        scanner.nextLine();

        System.out.println("\n" + CARDS_SHUFFLED);
        System.out.println("\n" + CardsDeck.getDeck());

        System.out.println(PLAYER_DRAW);
        scanner.nextLine();

        System.out.println(PLAYER_HAND);
        System.out.println("\n" + playersDeck);

        System.out.println(END_OF_GAME);
    }
}
