public class Main {
 
	public static void main(String[] args) { 
 
     StandardAccount acc1 = new StandardAccount(1, 100);
     SavingsAccount acc2 = new SavingsAccount(2, 200);
     CheckingAccount acc3  = new CheckingAccount(3, 300, 200);

    System.out.println( acc1.toString() + "\n" );
    System.out.println( acc2.toString() + "\n" );
    System.out.println( acc3.toString() + "\n" );

	}
}
