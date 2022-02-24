import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RefactorExample1 {

    Hand playerHand;
    Hand dealerCards;

    // Deck deck = new Deck();
    List<Integer> deck;

    public RefactorExample1() {
        playerHand = new Hand();
        dealerCards = new Hand();

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

    public void playGame() {
        initialDeal();

//        //TODO: Implement card drawing for player and dealer.
//        if(playerCards.value() < 21)
//            playerCards.add(deck.getCard());

        if(playerHand.value() > dealerCards.value()) {
            System.out.println("Player wins!");
        } else if (playerHand.value() == dealerCards.value()) {
            System.out.println("It's a draw.");
        } else {
            System.out.println("You lose.");
        }
    }

    private void initialDeal() {
        playerHand.add(drawCard());
        dealerCards.add(drawCard());
        playerHand.add(drawCard());
        dealerCards.add(drawCard());
    }

    private Integer drawCard() {
        int card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
