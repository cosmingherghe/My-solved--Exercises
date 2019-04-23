/*
(The Queue class) Section 10.6 gives a class for Stack. Design a class named
Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
elements are retrieved in a last-in first-out fashion. In a queue, the elements are
retrieved in a first-in first-out fashion. The class contains:
 ■ An int[] data field named elements that stores the int values in the queue.
 ■ A data field named size that stores the number of elements in the queue.
 ■ A constructor that creates a Queue object with default capacity 8.
 ■ The method enqueue(int v) that adds v into the queue. 
 ■ The method dequeue() that removes and returns the element from the queue.
 ■ The method empty() that returns true if the queue is empty.
 ■ The method getSize() that returns the size of the queue.
Draw an UML diagram for the class. Implement the class with the initial array
size set to 8. The array size will be doubled once the number of the elements
exceeds the size. After an element is removed from the beginning of the array,
you need to shift all elements in the array one position the left. Write a test
program that adds 20 numbers from 1 to 20 into the queue and removes these
numbers and displays them.
*/
 
public class Test {
 
	public static void main(String[] args) {
		
		//Write a test program that adds 20 numbers from 1 to 20 
		//into the queue and removes these numbers and displays them.
		
		Queue test = new Queue();
		
		//add 20 numbers from 1 to 20 into the queue
		for (int i = 0; i < 20; i++) { 
			int randomNumber1to20 = (int )(Math.random() * 20 + 1);
			test.enqueue( randomNumber1to20 ); 
		}
		
		//display Array
		for (int i = 0; i < test.getSize(); i++) {
			System.out.print( " " + test.peek(i) );
		}
		
		System.out.println();
		
		//removes these numbers and displays them.
		for (int i = 0; i < 20; i++) {
			System.out.print( " " + test.dequeue() );
		}
		
		System.out.println("\n Is empty = " + test.empty());
		
	}
}

class Queue {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
 
	/** Construct a queue with the default capacity 8 */
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
 
	/** Construct a queue with the specified maximum capacity */
	public Queue(int capacity) {
		elements = new int[capacity];
	}
  
	/** Push a new integer to the top of the queue */
	public void enqueue(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		} 
		elements[size++] = value;
	}
 
	/** Return and remove the first element from the queue */
	public int dequeue() {
		int firstElement = elements[0];
		size--;
		
		int temp[] = new int[size];
	    System.arraycopy(elements, 1, temp, 0, size); 
	    
	    elements = temp;
		return firstElement;
	}
 
	/** Return the top element from the queue */
	public int peek() {
		return elements[size - 1];
	}
	
	/** Return the place element from the queue */
	public int peek(int place) {
		return elements[place];
	}

	/** Test whether the queue is empty */
	public boolean empty() {
		return size == 0;
	}
 
	/** Return the number of elements in the queue */
	public int getSize() {
		return size;
	}
}
