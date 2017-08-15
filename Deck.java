package com.dharmeshsujeeun.warofcards;

import com.dharmeshsujeeun.warofcards.Card.Rank;
import com.dharmeshsujeeun.warofcards.Card.Suit;
import java.security.SecureRandom;

class Deck {
    private static final int NUM_CARDS_IN_DECK = 52;

    private static final SecureRandom rng = new SecureRandom();

    private final Card[] cards = new Card[NUM_CARDS_IN_DECK];

    // keeps track of which card is at the top of the deck, i.e. which card
    // is going to be drawn next from the deck
    private int indexOfTopCard = 0;

    public Deck() {
        createCards();
        shuffleCards();
    }

    private void createCards() {
        int numCardsCreated = 0;

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[numCardsCreated] = new Card(rank, suit);
                ++numCardsCreated;
            }
        }
    }

    private void shuffleCards() {
        int randomIndex;
        Card temp;

        try {
            for (int i = 0; i < NUM_CARDS_IN_DECK; ++i) {
                temp = (Card)cards[i].clone();
                randomIndex = rng.nextInt(NUM_CARDS_IN_DECK);
                cards[i] = cards[randomIndex];
                cards[randomIndex] = temp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Card getNextCard() throws Exception {
        Card card;

        try {
            card = cards[indexOfTopCard];
            ++indexOfTopCard;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("All cards have been drawn from the deck.");
        }

        return card;
    }
}
