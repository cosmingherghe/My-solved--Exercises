import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        //Use the &&, || and ^ operators
        System.out.println( (integer%5 == 0) && (integer%6 == 0)
                            ? "Is 10 divisible by 5 and 6? true"
                            : "Is 10 divisible by 5 and 6? false");

        System.out.println( (integer%5 == 0) || (integer%6 == 0)
                ? "Is 10 divisible by 5 or 6? true"
                : "Is 10 divisible by 5 or 6? false");

        System.out.println( (integer%5 == 0) ^ (integer%6 == 0)
                ? "Is 10 divisible by 5 or 6, but not both? true"
                : "Is 10 divisible by 5 or 6, but not both? false");
    }
}
