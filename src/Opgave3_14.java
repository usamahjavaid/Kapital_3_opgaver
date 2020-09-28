/*(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess, and
reports whether the guess is correct or incorrect.
 */

import java.util.Scanner;
import java.util.Random;

public class Opgave3_14 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {


            Scanner in = new Scanner(System.in);
            Random random = new Random();
            int coin_flip = random.nextInt(2);

            System.out.println("Enter 1 for heads and 2 for tails");
            int guess = in.nextInt();

            if (guess == coin_flip) System.out.println("Correct");

            else System.out.println("incorrect");
        }
    }
}