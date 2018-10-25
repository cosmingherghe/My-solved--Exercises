class Main {
  public static void main(String[] args) {

    MyInteger number1 = new MyInteger(121);
    MyInteger number2 = new MyInteger(121);

    System.out.println("number1.getValue() : " + number1.getValue() );
    System.out.println("number1.isEven() : " + number1.isEven() );
    System.out.println("number1.isOdd() : " + number1.isOdd() );
    System.out.println("number1.isPrime() : " + number1.isPrime() );

    System.out.println("MyInteger.isEven(20) : " + MyInteger.isEven(20) );
    System.out.println("MyInteger.isOdd(20) : " + MyInteger.isOdd(20) );

    System.out.println("MyInteger.isPrime(20) : " + MyInteger.isPrime(20) ); 
    System.out.println("number1.equals(number2) : " + number1.equals(number2) ); 

    char[] chars = {'2', '3', '4', '5'};
    System.out.println(MyInteger.parseInt(chars));
        
    String s = "2345";
    System.out.println(MyInteger.parseInt(s)); 
 
  }
}

/*
(The MyInteger class) Design a class named MyInteger. The class contains:
■■ An int data field named value that stores the int value represented by this object.
■■ A constructor that creates a MyInteger object for the specified int value.
■■ A getter method that returns the int value.
■■ The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
■■ The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
■■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
■■ The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
■■ A static method parseInt(char[]) that converts an array of numeric characters to an int value.
■■ A static method parseInt(String) that converts a string into an int value. 
Draw the UML diagram for the class then implement the class. Write a client program that tests all methods in the class.
*/

class MyInteger {

	private int value;


	MyInteger(int value){
		this.value = value;
	}


	public int getValue(){
		return value;
	}


	public boolean isEven() { 
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 == 1;
	}

	public boolean isPrime() {
		 //check if n is a multiple of 2
		if (value%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=value;i+=2) {
			if(value%i==0) return false;
		}
		return true;
	}

  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static boolean isOdd(int n) {
    return n % 2 == 1;
  }
  
  public static boolean isPrime(int n){
    //check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) return false;
		}
		return true;
  }

  public static boolean isEven(MyInteger n) {
    return n.isEven();
  }
  
  public static boolean isOdd(MyInteger n) {
    return n.isOdd();
  }
  
  public static boolean isPrime(MyInteger n){
    return n.isPrime();
  }

  public boolean equals(int n) {
    return this.value == n;
  }
  
  
  public boolean equals(MyInteger n){
    return n.equals(value);
  }

  public static int parseInt(String s) {
    return Integer.parseInt(s);
  }

  public static int parseInt(char[] s) {
        return parseInt(new String(s));
  }

}
