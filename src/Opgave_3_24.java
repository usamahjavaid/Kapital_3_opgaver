/*(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
*/
import java.util.Random;
public class Opgave_3_24 {
    public static void main(String[] args) {
        //Generate a random integer
        Random random = new Random();
        int rank = random.nextInt(13);
        //Generate a random integer from suit
        int suit = random.nextInt(4);

        //Display card picked from deck
        System.out.println("The card you picked is ");
        switch (rank) {
            case 1: System.out.println("Ace ");break;
            case 2: System.out.println("2");break;
            case 3: System.out.println("3");break;
            case 4: System.out.println("4");break;
            case 5: System.out.println("5");break;
            case 6: System.out.println("6");break;
            case 7: System.out.println("7");break;
            case 8: System.out.println("8");break;
            case 9: System.out.println("9");break;
            case 10:System.out.println("10");break;
            case 11:System.out.println("Jack");break;
            case 12:System.out.println("Queen");break;
            case 13: System.out.println("King");


        }
        System.out.println(" of ");
           switch (suit){
               case 1: System.out.println("Clubs "); break;
               case 2: System.out.println("Diamonds "); break;
               case 3: System.out.println("Hearts "); break;
               case 4: System.out.println("Spades ");



           }

    }
}