package ch04;

/**
 * A {@code Card} object represents a playing card, such
 * as "Queen of Hearts". A card has a suit (Diamond, Heart,
 * Spade or Club) and a value (1=Ace, 2 ... 10, 11= Jack,
 * 12=Queen, 13=King)
 */
public class Card {

    /**
     * The suit of the card is Diamond.
     */
    public static final int HEART = 1;
    
    /**
     * add two integers and return the result.
     * @deprecated Use {@link #add3(int, int)} instead.
     * @see #add3(int, int)
     * @see <a href="https://xinghaige.github.io//100k-Star-Challenge/index.html">100k Star Challenge</a>
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add3(int a, int b) {
        return a + b + 3;
    }

}
