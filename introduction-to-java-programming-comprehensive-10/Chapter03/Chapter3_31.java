import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      		Scanner input = new Scanner(System.in);

          System.out.println("Enter:\n" +
	          " - 0 to convert from U.S. dollars to Chinese RMB\n"+
	          " - 1 to convert from Chinese RMB and U.S. dollars");

          int convertTo = input.nextInt();


	          System.out.print((convertTo == 0) ? 
	          	"Enter the amount in U.S. dollars: " : 
	          	"Enter the amount in Chinese RMB: ");
	          double amount = input.nextDouble();

	          System.out.println("Enter the exchange rate from dollars to RMB: ");
          double exchangeRate = input.nextDouble();

	          System.out.println((convertTo == 0)?("$"+ amount + " is "+ (exchangeRate*amount) + " yuan ")
	          			:(amount + " yuan is $" + (amount/exchangeRate)  ));
                  }

    }
}
