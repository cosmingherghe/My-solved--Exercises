import java.util.Scanner;

public class ComputeGCD {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers and displays their GCD: ");
        int m = input.nextInt();
        int n = input.nextInt();
        input.close();

        // Find and display the Fibonacci number
        System.out.println("Greatest common divisor for " + m + " and " + n + " is " + (  m > n ? gcd(m, n) : gcd(n, m)) );
    }
 

    public static int gcd(int m, int n) {
        if(m % n == 0)
            return n;
        else
            return gcd(m, m % n);
    }
}