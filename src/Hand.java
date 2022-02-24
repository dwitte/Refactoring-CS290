import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        // PROBLEM!!!! we are interpreting the int passed in as the value of the card, not the index of the card.
        // Something doesn't quite feel right....
        cards.add(card);
    }

    public int value() {
        int playerHandValue = 0;
        for (Card card : this.cards) {
            playerHandValue += card.value();
        }
        return playerHandValue;
    }
}
