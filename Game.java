package com.dharmeshsujeeun.warofcards;

import java.util.Scanner;
import static java.lang.System.*;

class Game {
    private Deck deck;
    private int roundsPlayed;
    private static final int MAX_ROUNDS = 26;
    private String p1Name;
    private String p2Name;
    private int p1Score;
    private int p2Score;
    private static final Scanner input = new Scanner(in);

    public Game() {
        deck = new Deck();
        roundsPlayed = 0;
        p1Name = "";
        p2Name = "";
        p1Score = 0;
        p2Score = 0;
    }

    public void run() {
        int numPlayers = askForNumberOfPlayers();
        p1Name = getPlayerName(1);
        if (numPlayers == 1) {
            p2Name = "Computer";
        } else {
            p2Name = getPlayerName(2);
        }

        Card p1Card;
        Card p2Card;

        while (roundsPlayed < MAX_ROUNDS) {
            try {
                p1Card = deck.getNextCard();
                p2Card = deck.getNextCard();

                out.printf("%nThis is Round %d %n%n", roundsPlayed + 1);

                if (p1Card.compareTo(p2Card) < 0) {
                    p2Score += 2;
                    out.printf("%s wins this round!%n", p2Name);
                } else if (p1Card.compareTo(p2Card) > 0) {
                    p1Score += 2;
                    out.printf("%s wins this round!%n", p1Name);
                } else {
                    ++p1Score;
                    ++p2Score;
                    out.printf("This round is a tie!%n");
                }
            } catch (Exception e) {
                out.println("An error occurred. Please try running the game again.");
            }

            out.printf("%s's score: %d%n", p1Name, p1Score);
            out.printf("%s's score: %d%n", p2Name, p2Score);

            ++roundsPlayed;
        }

        out.printf("%nGame's over. ");
        if (p1Score > p2Score) {
            out.printf("%s wins!%n%n", p1Name);
        } else if (p1Score < p2Score) {
            out.printf("%s wins!%n%n", p2Name);
        } else {
            out.printf("It is a tie!%n%n");
        }

        // get ready to run another game
        deck = new Deck();
        roundsPlayed = 0;
        p1Name = "";
        p2Name = "";
        p1Score = 0;
        p2Score = 0;
    }

    private int askForNumberOfPlayers() {
        int numPlayers = 0;

        while (numPlayers == 0) {
            out.printf("Enter number of players (1 or 2): ");

            try {
                numPlayers = input.nextInt();

                // if user enters an integer other than 1 or 2, then
                // reset to 0 so loop continuation condition is true
                // and user is prompted again
                if (numPlayers != 1 && numPlayers != 2) {
                    numPlayers = 0;
                    out.println("Number entered must be 1 or 2.");
                }
            } catch (Exception e) {
                out.println("Invalid input. Try again.");
            }
        }

        return numPlayers;
    }

    private String getPlayerName(int playerNumber) {
        String name = "";

        while (name.length() == 0) {
            // prompt user to enter a name
            out.printf("%nPlayer %d name (max of 15 characters): ", playerNumber);
            name = input.next();

            // name of player cannot be over 15 characters
            if (name.length() > 15) {
                out.println("Name can be a maximum of 15 characters. Try again.");
                // reset to empty string to that loop continuation condition is true
                // and user is prompted to enter a name again
                name = "";
            }
        }

        return name;
    }
}
