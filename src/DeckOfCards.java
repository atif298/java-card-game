import java.util.ArrayList;

public class CardGameUtils {
    private final String[] suits = {"\u2660","\u2663","\u2665","\u2666"};
                                    // SPADES, CLUBS, HEARTS, DIAMONDS
    private final String[] symbols = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private static ArrayList<Card> deck;

    CardGameUtils() {
        deck = new ArrayList<>();
        for (String suit:suits) {
            for (String symbol:symbols) {
                int value = 0;
                for (int i = 0; i < symbols.length; i++) {
                    if (symbols[i] == symbol) {
                        value = i + 1;
                    }
                }
                deck.add(new Card(suit,symbol,value));
                }
        }
    }

    public static ArrayList<Card> getDeck() {
        // Sout needs to be removed when games finalised
        System.out.println(deck);
        return deck;
    }
}