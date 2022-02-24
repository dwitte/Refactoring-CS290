import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RefactorExample1 {

    Hand playerHand;
    Hand dealerCards;

    private Deck deck;

    public RefactorExample1() {
        playerHand = new Hand();
        dealerCards = new Hand();

        deck = new Deck();
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
        playerHand.add(deck.drawCard());
        dealerCards.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        dealerCards.add(deck.drawCard());
    }
}
