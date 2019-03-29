package javatwo;

import java.util.ArrayList;


public class Deck {

    static ArrayList<Card> makeDeck;
    private String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        // Make the makeDeck

        makeDeck = new ArrayList<Card>();

        for (int i = 0; i < suit.length; i++) {
            for (int x = 0; x < rank.length; x++) {
                makeDeck.add(new Card(suit[i], rank[x]));
            }
        }


    }

    public String fullDeck() {
        String output = "";
        for (int i = 0; i < makeDeck.size(); i++) {
            output += makeDeck.get(i).toString() + "\n";
        }
        return output;
    }

    public String getHand() {
        String hand = "";
        for (int i = 0; i < 5; i++) {
            hand += makeDeck.get(i).toString() + "\n";

        }
        return hand;
    }


}
