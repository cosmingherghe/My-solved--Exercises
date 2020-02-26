import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Write a number: ");
        int number = input.nextInt();
        input.close();

        System.out.println( number + " factorial is " + number + "! = " + getFac(number));
    }

    public static BigInteger getFac(int number) {
        BigInteger result = new BigInteger("1");
        if(number == 1)
            return result;
        else
            return getFac(number, result);
    }

    public static BigInteger getFac(int number, BigInteger result) {
        if(number == 1)
            return result;
        else
            return getFac(number - 1, result.multiply(BigInteger.valueOf(number))); 
    }
}