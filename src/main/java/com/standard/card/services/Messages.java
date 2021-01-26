package com.standard.card.services;

/**
 * The interface will consist of all application messages, and global constants.
 */
public interface Messages {

    String WELCOME = "\n*************************************\n Welcome To Five Card Draw Poker Game \n*************************************\n";

    String TEST_START_MESSAGE = "\n**************** Starting Test(s) ******************\n";

    String TEST_END_MESSAGE = "\n**************** Test(s) Execution Finished ******************\n";

    String GAME_START = "************* Game beginning, Please make sure to follow and understand game rule(s) and direction(s) ***********\n";

    String END_OF_GAME = "\n**************** Game Closing, Thank you For Taking Part ******************\n";

    String GAME_START_USER_PROMPT = "**************** Please press enter to start the game  ******************\n";

    String PLAYERS_NUMBER = "Please enter players number : ";

    String CARDS_NUMBER = "Please enter player cards number : ";

    String CARDS_SHUFFLE = "\n*************** Please press enter to shuffle the cards *****************";

    String CARDS_SHUFFLED = "n*************** Shuffled Cards Deck *****************";

    String PLAYER_DRAW = "\n*************** Please press enter for players draw *****************";

    String PLAYER_HAND = "*************** Player(s) hand(s) *****************";
}
