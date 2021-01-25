package com.standard.card.lookup;

import com.standard.card.utilities.RankIncludes;
import com.standard.card.utilities.Suits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class consist of constants or predefined objects
 */
public class LookUps {

    /**
     * Predefined lists of cards suits and ranks
     */
    private static final List<String> suitList = new ArrayList<>(Arrays.asList(Suits.CLUBS.name(), Suits.DIAMONDS.name(), Suits.HEARTS.name(), Suits.SPADES.name()));

    private static final List<String> rankList = new ArrayList<>(Arrays.asList(RankIncludes.ACE.name(), "2", "3", "4", "5", "6", "7", "8", "9", "10", RankIncludes.JACK.name() ,RankIncludes.QUEEN.name(), RankIncludes.KING.name()));

    /**
     * SuitList & RankList getters
     */
    public static List<String> getSuitList() {
        return suitList;
    }

    public static List<String> getRankList() {
        return rankList;
    }
}
