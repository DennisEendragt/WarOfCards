package com.dharmeshsujeeun.warofcards;

class Card implements Comparable<Card> {
    private int rank;
    private String suit;

    public int getRank() {
        return rank;
    }

    public int compareTo(Card other) {
        return Integer.compare(rank, other.rank);
    }

    public String toString() {
        String representation = "";

        if (rank == 1 || rank > 10) {
            switch (rank) {
                case 1:
                    representation += "Ace";
                    break;
                case 11:
                    representation += "Jack";
                    break;
                case 12:
                    representation += "Queen";
                    break;
                case 13:
                    representation += "King";
                    break;
            }
        } else {
            representation += rank;
        }

        representation += " of " + suit;

        return representation;
    }
}
