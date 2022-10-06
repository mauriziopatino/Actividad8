import java.util.*;

public class Deck {
    public static List<Card> deckList = new ArrayList<Card>();

    public Deck() {
        createCards("Tréboles", "Negro");
        createCards("Corazones", "Rojo");
        createCards("Picas", "Negro");
        createCards("Diamantes", "Rojo");

        System.out.println(deckList.size());
    }

    public static void createCards(String palo, String color) {

        // Se crean las 13 cartas
        for (int i = 1; i < 14; i++) {

            if(i != 1 && i != 11 && i != 12 && i != 13){
                Card newCard = new Card(palo, color, Integer.toString(i));
                deckList.add(newCard);
            } else if (i == 1) {
                Card newCard = new Card(palo, color, "A");
                deckList.add(newCard);
            } else if (i == 11) {
                Card newCard = new Card(palo, color, "11");
                deckList.add(newCard);
            } else if (i == 12) {
                Card newCard = new Card(palo, color, "12");
                deckList.add(newCard);
            } else if (i == 13) {
                Card newCard = new Card(palo, color, "13");
                deckList.add(newCard);
            }
        }
    }

    public static void shuffle() {
        System.out.println("Se mezcló el deck");

        Collections.shuffle(deckList);
    }

    public static void head() {

        Card firstElement = deckList.get(0);
        System.out.println(firstElement.palo + "," + firstElement.color + "," + firstElement.valor);
        deckList.remove(firstElement);
        System.out.println("Quedan " + deckList.size());
    }

    public static void pick() {
        Random myRandom = new Random();
        int randNumber = myRandom.nextInt(1, deckList.size());
        System.out.println(deckList.get(randNumber).palo + ","
                + deckList.get(randNumber).color + ","
                + deckList.get(randNumber).valor);

        deckList.remove(randNumber);
        System.out.println("Quedan " + deckList.size());

    }

    public static void hand() {
        Random myRandom = new Random();
        for (int i = 1; i < 6; i++) {
            int randNumber = myRandom.nextInt(1, deckList.size());
            System.out.println(deckList.get(randNumber).palo + ","
                    + deckList.get(randNumber).color + ","
                    + deckList.get(randNumber).valor);
            deckList.remove(randNumber);

        }

        System.out.println("Quedan " + deckList.size());
    }

    @Override
    public String toString() {
        return "Deck{}";
    }
}

