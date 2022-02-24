import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<Integer> deck;

    public Deck() {
        //Setup all of the cards in order.
        List<Integer> initialDeck = new ArrayList<>();
        for(int i = 0; i<52; i++) {
            initialDeck.add(i);
        }
        //Randomize the deck order
        Random random = new Random();
        while(!initialDeck.isEmpty()) {
            deck.add(initialDeck.get(random.nextInt(initialDeck.size())));
        }
    }

    public Integer drawCard() {
        int card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
