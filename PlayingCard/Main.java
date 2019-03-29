package javatwo;


import java.util.Collections;
import static javatwo.Deck.makeDeck;



public class Main {

    public static void main(String[] args) {

        Deck one = new Deck();

        //Open new deck of cards

        System.out.println(one.fullDeck());

        //shuffle cards

        Collections.shuffle(makeDeck);
        //Collections.shuffle(makeDeck);

        //Deal 5 cards

        System.out.println(one.getHand());


    }
}
