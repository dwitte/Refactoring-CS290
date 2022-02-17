import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RefactorExample1 {

    List<Integer> playerCards;
    List<Integer> dealerCards;

    public RefactorExample1() {
        playerCards = new ArrayList();
        dealerCards = new ArrayList();
    }

    public void playGame() {
        Random rand = new Random();
        playerCards.add(rand.nextInt(10));
        dealerCards.add(rand.nextInt(10));
        playerCards.add(rand.nextInt(10));
        dealerCards.add(rand.nextInt(10));

        //TODO: Implement card drawing for player and dealer.

        int playerHandValue = 0;
        for(Integer val : playerCards) {
            playerHandValue += val;
        }

        int dealerHandValue = 0;
        for(Integer val : dealerCards) {
            dealerHandValue += val;
        }

        if(playerHandValue > dealerHandValue) {
            System.out.println("Player wins!");
        } else if (playerHandValue == dealerHandValue) {
            System.out.println("It's a draw.");
        } else {
            System.out.println("You lose.");
        }
    }
}
