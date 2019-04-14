
/*
(Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.
*/

import java.util.Scanner;
 
public class Main {

	private static Scanner input;

	public static void main(String[] args) { 
		
		input = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
	 
		int testInt = input.nextInt();  
		
		PrimeNumbers test = new PrimeNumbers(testInt);
		test.displayDecreasingOrder();
		
	} 
}


 class PrimeNumbers {
	private StackOfIntegers primeNumbers = new StackOfIntegers();
	private int testNumber;
	
	public PrimeNumbers(int testNumber) {
		this.testNumber = testNumber;
		addAllPriNoLessThan();
	}
	
	//checks whether an int is prime or not
	public boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	//add all the prime numbers less than testNumber in decreasing order
	public void addAllPriNoLessThan() { 
		for( int n = this.testNumber; n>0; n--) {
			if(isPrime(n)) {
				primeNumbers.push(n);
			}
		}
	}

	//Display StackOfIntegers primeNumbers in increasing order
	public void displayIncreasingOrder() { 
		System.out.println("Prime numbers in increasing order for " + testNumber + " are: ");
		for (int i = primeNumbers.getSize() - 1; i >= 0 ; i--)
			System.out.print(primeNumbers.peek(i) + " " );
	}

	//Display StackOfIntegers primeNumbers in decreasing order
	public void displayDecreasingOrder() { 
		System.out.println("Prime numbers in decreasing order for " + testNumber + " are: " );
		for (int i = 0; i < primeNumbers.getSize(); i++)
			System.out.print(primeNumbers.peek(i) + " " ); 
	}
	 
}




class StackOfIntegers {

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
