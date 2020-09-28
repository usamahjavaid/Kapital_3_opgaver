/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.
*/

import java.util.Scanner;
public class Opgave3_5 {

    public static void main(String[] args) {
        // Make Scanner
        Scanner in = new Scanner(System.in);


        // prompts the user to enter an integer for today's day of the week
        System.out.println("Enter Today¨s day: ");
        int day = in.nextInt();

        // prompt the user to enter the number of days after today
        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = in.nextInt();

        // the future day of the week
        int futureDay = (day + daysElapsed) % 7;

       switch (day){

           case 0: System.out.print("Today is Sunday"); break;
           case 1: System.out.print("Today is Monday"); break;
           case 2: System.out.print("Today Tuesday"); break;
           case 3: System.out.print("Today Wednesday"); break;
           case 4: System.out.print("Today Thursday"); break;
           case 5: System.out.print("Today Friday"); break;
           case 6: System.out.print("Today Saturday");


       }
       if (futureDay == 0)
           System.out.println(" and the future day is Sunday");
       else if (futureDay == 1)
           System.out.println(" and the future day is monday ");
       else if (futureDay == 2)
           System.out.println(" and the future day is Tuesday");
       else if (futureDay == 3)
           System.out.println(" and the future day is Wednesday ");
       else if (futureDay == 4)
           System.out.println(" and the future day is Thursday");
       else if (futureDay == 5)
           System.out.println(" and the future day is Friday");
       else if (futureDay == 6)
           System.out.println(" and the future day is Saturday");




       }



        }

