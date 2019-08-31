
import java.util.*;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		shuffle(intList);
		
		//Display Result
		for (int i = 0; i < intList.size(); i++) {
			System.out.println("\nKey(" + i + ") : value: " + intList.get(i));
		}
		
	}
	
	//Array List
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}

}
