/* (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches
*/

import java. util. Scanner;
public class Opgave3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        //Prompt the user to enter weight in pounds
        System.out.println("Enter weight in pounds ");
        double weight = in.nextDouble();

        //Prompt the user to enter feet
        System.out.println("Enter feet ");
        double feet = in.nextDouble();

        //Prompt the user to enter inches
        System.out.println("Enter inches ");
        double inches = in.nextDouble();

        inches = inches + feet * 12;

        final double Kilograms_per_pounds = 0.45359237;
        final double Meters_Per_inch = 0.0254;

        //Compute BMI
        double Weight_in_kilograms = weight * Kilograms_per_pounds;
        double Height_in_Meters  = inches * Meters_Per_inch;
        double bmi = Weight_in_kilograms / (Height_in_Meters * Height_in_Meters);

        //Display results
        System.out.println("bmi is" + bmi);
        if (bmi<18.5) System.out.println("Underweight ");
        else if (bmi < 25)
            System.out.println("normal weight ");
        else if (bmi < 30)
            System.out.println("overweight");

        else System.out.println("Obese ");


    }
}
