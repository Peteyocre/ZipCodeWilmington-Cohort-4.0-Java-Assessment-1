package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign.toLowerCase().equals("rock")) {
            return PAPER;
        }
        else if (handSign.toLowerCase().equals("paper")) {
            return SCISSOR;
        }
        else if (handSign.toLowerCase().equals("scissor")) {
            return ROCK;
        } else {
            return null;
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if (handSign.toLowerCase().equals("rock")) {
            return SCISSOR;
        }
        else if (handSign.toLowerCase().equals("paper")) {
            return ROCK;
        }
        else if (handSign.toLowerCase().equals("scissor")) {
            return PAPER;
        } else {
            return null;
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if (handSignOfPlayer1.toLowerCase().equals("rock") && handSignOfPlayer2.toLowerCase().equals("paper")) {
            return PAPER;
        }
        else if (handSignOfPlayer1.toLowerCase().equals("rock") && handSignOfPlayer2.toLowerCase().equals("scissor")) {
            return ROCK;
        }
        else if (handSignOfPlayer1.toLowerCase().equals("rock") && handSignOfPlayer2.toLowerCase().equals("rock")) {
            return null;
        }
        else if (handSignOfPlayer1.toLowerCase().equals("paper") && handSignOfPlayer2.toLowerCase().equals("paper")) {
            return null;
        }
        else if (handSignOfPlayer1.toLowerCase().equals("paper") && handSignOfPlayer2.toLowerCase().equals("scissor")) {
            return SCISSOR;

        } else if (handSignOfPlayer1.toLowerCase().equals("paper") && handSignOfPlayer2.toLowerCase().equals("rock")) {
            return PAPER;

        } else if (handSignOfPlayer1.toLowerCase().equals("scissor") && handSignOfPlayer2.toLowerCase().equals("paper")) {
            return SCISSOR;
        } else if (handSignOfPlayer1.toLowerCase().equals("scissor") && handSignOfPlayer2.toLowerCase().equals("rock")) {
            return ROCK;
        } else if (handSignOfPlayer1.toLowerCase().equals("scissor") && handSignOfPlayer2.toLowerCase().equals("scissor")) {
            return null;
        } else return null;
    }
}
