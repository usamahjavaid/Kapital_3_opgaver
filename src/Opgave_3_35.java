import java.util.Scanner;
public class Opgave_3_35 {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        number = in.nextInt();


        if (number % 2 == 0)
            System.out.println("even ");
        else System.out.println("odd");
    }
}
