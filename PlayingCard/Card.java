package javatwo;

public class Card {

    private String suit;
    private String rank;

    public Card() {

        suit = "";
        rank = "";
    }

   public Card(String rank, String suit) {

        this.suit = suit;
        this.rank = rank;
   }

    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    public String toString() {

        return String.format ("%s of %s", suit, rank);
    }
}


