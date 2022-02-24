public class Card {

    int index;

    public Card(int index) {
        this.index = index;
    }

    public int value() {
        if(index % 13 == 10 || index % 13 == 11 || index % 13 == 12) {
            return 10;
        } else {
            return index % 13 + 1;
        }
    }
}
