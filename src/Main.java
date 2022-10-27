import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        showMenu(myDeck);
    }

    public static void showMenu(Deck myDeck) {
        boolean play = true;

        do {
            try{
                System.out.println("Bienvenido a Poker!");
                System.out.println("Seleccionar opción");
                System.out.println("1 Mezclar Deck");
                System.out.println("2 Sacar carta");
                System.out.println("3 Carta al azar");
                System.out.println("4 Generar una mano de 5 cartas");

                Scanner sc = new Scanner(System.in);
                int response = sc.nextInt();

                switch (response) {
                    case 1:
                        play = false;
                        myDeck.shuffle();
                        break;
                    case 2:
                        play = false;
                        myDeck.head();
                        break;
                    case 3:
                        play = false;
                        myDeck.pick();
                        break;
                    case 4:
                        play = false;
                        myDeck.hand();
                        break;
                    default:
                        throw new Exception("Opción no válida");
                }
            }catch(Exception e){
                System.out.println(e);
            }

        } while(play);
    }
}
