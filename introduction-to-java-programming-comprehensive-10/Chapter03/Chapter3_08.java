//      (Sort three integers) Write a program that prompts the user to enter three integers
//      and display the integers in non-decreasing order

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int nofirst = input.nextInt();
        int nosecond = input.nextInt();
        int nothird = input.nextInt();

        int nosorting;
        if (nofirst > nosecond) {
            nosorting = nofirst;
            nofirst = nosecond;
            nosecond = nosorting;
        }
        if (nosecond > nothird) {
            nosorting = nosecond;
            nosecond = nothird;
            nothird = nosorting;
        }
        if (nofirst > nosecond) {
            nosorting = nofirst;
            nofirst = nosecond;
            nosecond = nosorting;
        }

        System.out.println("The non-decreasing order is: " + nofirst + " " + nosecond + " " + nothird);
    }
}
