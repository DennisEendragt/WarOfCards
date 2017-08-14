package com.dharmeshsujeeun.warofcards;

class CardTest {
    public static void main(String[] args) {
        Card queenOfHearts = new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
        //System.out.println(queenOfHearts);

        Card kingOfSpades = new Card(Card.Rank.KING, Card.Suit.SPADES);
        Card kingOfHearts = new Card(Card.Rank.KING, Card.Suit.HEARTS);
        Card aceOfDiamonds = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);

        compare(kingOfSpades, queenOfHearts);
        compare(kingOfSpades, kingOfHearts);
        compare(aceOfDiamonds, kingOfSpades);
    }

    private static void compare(Card a, Card b) {
        if (a.compareTo(b) > 0) {
            System.out.printf("%s > %s %n", a, b);
        } else if (a.compareTo(b) < 0) {
            System.out.printf("%s < %s %n", a, b);
        } else {
            System.out.printf("%s = %s %n", a, b);
        }
    }
}
