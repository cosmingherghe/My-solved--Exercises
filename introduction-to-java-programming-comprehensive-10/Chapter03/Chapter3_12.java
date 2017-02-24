//        (Palindrome number) Write a program that prompts the user to enter a three-digit
//        integer and determines whether it is a palindrome number. A number is palindrome
//        if it reads the same from right to left and from left to right.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int threeNoInt = input.nextInt();

        int firstInt = threeNoInt%10;
        int lastInt = threeNoInt/100;
        if(firstInt == lastInt) {
            System.out.print(threeNoInt + " is a palindrome");
        } else {
            System.out.println(threeNoInt + " is a not palindrome");
        }

    }
}
