import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<Card> deck;

    public Deck() {
        //Setup all of the cards in order. Cards use an index to identify them uniquely.
        List<Card> initialDeck = new ArrayList<>();
        for(int i = 0; i<52; i++) {
            initialDeck.add(new Card(i));
        }
        //Randomize the deck order
        Random random = new Random();
        while(!initialDeck.isEmpty()) {
            deck.add(initialDeck.get(random.nextInt(initialDeck.size())));
        }
    }

    public Card drawCard() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
