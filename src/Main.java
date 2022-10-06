import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        myDeck.deckList.forEach(System.out::println);

        myDeck.hand();

    }
}
