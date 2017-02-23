//        (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
//        subtraction question. Revise the program to randomly generate an addition question
//        with two integers less than 100.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);

        if(number2>number1){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + " = ");
        int answer1 = input.nextInt();
        if(answer1 == (number1 - number2)) {
            System.out.println("Your are correct!");
        }else{
            System.out.println("You are wrong");
            System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));
        }

        int number3 = (int)(Math.random() * 100);
        int number4 = (int)(Math.random() * 100);

        if(number4>number3){
            int temp = number3;
            number3 = number4;
            number4 = temp;
        }

        System.out.print("What is " + number3 + " - " + number4 + " = ");
        int answer2 = input.nextInt();
        if(answer2 == (number3 - number4)) {
            System.out.println("Your are correct!");
        }else{
            System.out.println("You are wrong");
            System.out.println(number3 + " - " + number4 + " is " + (number3 - number4));
        }

    }
}
