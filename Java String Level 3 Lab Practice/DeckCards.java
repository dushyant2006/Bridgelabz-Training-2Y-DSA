import java.util.Scanner;

public class DeckCards {

    public static String[] createDeck() {
        String suits[] = {"Hearts","Diamonds","Clubs","Spades"};
        String ranks[] = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
        };

        String deck[] = new String[suits.length * ranks.length];
        int k = 0;

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deck[k++] = ranks[j] + " of " + suits[i];

        return deck;
    }

    public static
