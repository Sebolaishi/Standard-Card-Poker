package com.standard.card.Exceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The class will contain exception strategies and
 */
public class ExceptionManager {

    protected static int validatePlayerInput(String playersNumber, Scanner scanner){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(playersNumber);

        while (matcher.find()){
            System.out.println("Error! Amount should not contain letters, please try again : ");
            playersNumber = scanner.next();
        }

        return Integer.parseInt(playersNumber);
    }
}
