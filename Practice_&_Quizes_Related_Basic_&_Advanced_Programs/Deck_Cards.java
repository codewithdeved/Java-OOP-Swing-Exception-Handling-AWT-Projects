// The problem is to write a program that picks four cards randomly
// from a deck of 52 cards. All the cards can be represented using an
// array named deck, filled with initial values 0 to 51, as follows:
// Int [ ] deck = new int[52];
// // Initialize cards for (int i = 0; i < deck.length; i++) deck[i] = i;
// Card numbers 0 to 12, 13 to 25, 26 to 38, 39 to 51 represent 13
// Spades, 13 Hearts, 13 Diamonds, and 13 Clubs, respectively, as
// shown in Figure 6.3. After shuffling the array deck, pick the first four
// cards from deck.

import java.util.Arrays;

import java.util.Collections;

public class Deck_Cards {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        Integer[] deck = new Integer[52];

        String[] deckCardNames = { "Spades", "Hearts", "Diamonds", "Clubs" };

        for (int i = 0; i < deck.length; i++) {

            deck[i] = i;

        }

        Collections.shuffle(Arrays.asList(deck));

        System.out.println("Randomly picked four cards:");

        for (int i = 0; i < 4; i++) {

            int cardNumber = deck[i];

            String suit = deckCardNames[cardNumber / 13];

            int deckCardNumber = (cardNumber % 13) + 1;

            System.out.println("Card " + (i + 1) + ": " + deckCardNumber + " of " + suit);

        }

    }

}