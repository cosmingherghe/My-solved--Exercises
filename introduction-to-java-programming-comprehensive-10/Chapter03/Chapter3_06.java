//      (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
//      let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
//      inches, you will enter 5 for feet and 10 for inches.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double kilograms = input.nextDouble() / 2.20462;  // Convert pounds to kg

        System.out.print("Enter feet: ");
        double inches = 12 * input.nextDouble();  // Convert feet to inches

        System.out.print("Enter inches: ");
        double centimeters = 2.54 * (inches + input.nextDouble());  // Convert inches to centimeters
        double bmifinal =  (kilograms / Math.pow(2, (centimeters/100)));  // calculate body mass index

        String bmicat; // set category for BMI result
        if(bmifinal<18.5) {
            bmicat = "Underweight";
        }
        else if((bmifinal >= 18.5) && (bmifinal <= 25)) {
            bmicat = "Normal";
        }
        else if((bmifinal > 25) && (bmifinal <= 30)) {
            bmicat = "Overweight";
        }
        else {
            bmicat = "Obese";
        }
        
        System.out.println("BMI is " + bmifinal + ". " + bmicat);
    }
}
