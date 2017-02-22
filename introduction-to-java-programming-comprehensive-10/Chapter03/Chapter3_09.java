//        If the checksum is 10, the last digit is denoted as X according to the ISBN-10
//        convention. Write a program that prompts the user to enter the first 9 digits and
//        displays the 10-digit ISBN (including leading zeros). Your program should read
//        the input as an integer.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digitsint = input.nextInt();
        int d9 = digitsint%10;
        digitsint /=10;
        int d8 = digitsint%10;
        digitsint /=10;
        int d7 = digitsint%10;
        digitsint /=10;
        int d6 = digitsint%10;
        digitsint /=10;
        int d5 = digitsint%10;
        digitsint /=10;
        int d4 = digitsint%10;
        digitsint /=10;
        int d3 = digitsint%10;
        digitsint /=10;
        int d2 = digitsint%10;
        digitsint /=10;
        int d1 = digitsint%10;
        digitsint /=10;

        System.out.println("TThe ISBN-10 number is: " +
                d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 +
                +  ((d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11));
    }
}
