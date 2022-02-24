import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Integer> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(int card) {
        // PROBLEM!!!! we are interpreting the int passed in as the value of the card, not the index of the card.
        // Something doesn't quite feel right....
        cards.add(card);
    }

    public int value() {
        int playerHandValue = 0;
        for (Integer val : this.cards) {
            playerHandValue += val;
        }
        return playerHandValue;
    }
}
