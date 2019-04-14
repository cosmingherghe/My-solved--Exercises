/*
(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order
*/

public class Test {

	public static void main(String[] args) {
  
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
	 
		int testInt = input.nextInt();
		
		PrimeFactors test = new PrimeFactors(testInt);
		test.displayDecreasingOrder();
		
	}

}

package test;
 
public class PrimeFactors {
	
	private StackOfIntegers primeFactors = new StackOfIntegers();
	private int testNumber;
	
	public PrimeFactors(int testNumber) {
		this.testNumber = testNumber;
		
		int i = 2;
		while( i < testNumber){
			
			if( testNumber % i == 0 ) {
				testNumber /= i;
				primeFactors.push(i); 
			}
			else i++;
			
			if(i > testNumber || i == testNumber) 
				primeFactors.push(i);
		}
	}
	
	public void displayDecreasingOrder() {
		
		if( primeFactors.getSize() > 2) {
			System.out.print("The smallest factors in decreasing order for " + testNumber + " are: ");
			for (int i = primeFactors.getSize() - 1; i >= 0 ; i--)
				System.out.print(primeFactors.peek(i) + " " );
			}
			else 
				oneDisplay();		
	}
	
	public void displayIncreasingOrder() {
		
		if( primeFactors.getSize() > 2) {
			System.out.print("The smallest factors in increasing order for " + testNumber + " are: ");
			for (int i = 0; i < primeFactors.getSize(); i++)
				System.out.print(primeFactors.peek(i) + " " );
		}
		else 
			oneDisplay();
		
	}
	
	public void oneDisplay() {
		if( primeFactors.getSize() == 2) {
			System.out.print( "Smallest factor for " + testNumber + " is: " + primeFactors.peek(0) );
		}
		else {
			System.out.print( testNumber + " prime number.");
		}
	}

}


package test; 

public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
 
	/** Construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
 
	/** Construct a stack with the specified maximum capacity */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
  
	/** Push a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		} 
		elements[size++] = value;
	}
 
	/** Return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}
 
	/** Return the top element from the stack */
	public int peek() {
		return elements[size - 1];
	}
	
	/** Return the place element from the stack */
	public int peek(int place) {
		return elements[place];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}
 
	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}
	
}
