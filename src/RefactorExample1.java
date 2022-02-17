import java.util.Random;

public class RefactorExample1 {

    Hand playerHand;
    Hand dealerCards;

    // Deck deck = new Deck();

    public RefactorExample1() {
        playerHand = new Hand();
        dealerCards = new Hand();
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
        Random rand = new Random();
        playerHand.add(rand.nextInt(10));
        dealerCards.add(rand.nextInt(10));
        playerHand.add(rand.nextInt(10));
        dealerCards.add(rand.nextInt(10));
    }
}
