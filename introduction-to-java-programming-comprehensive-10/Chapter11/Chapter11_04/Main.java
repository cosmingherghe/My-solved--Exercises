import java.util.*;

public class Main {
 
	public static void main(String[] args) { 

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("Enter a sequence of numbers ending with 0:");
    
    while(scan.hasNextInt()) {
      int digit = scan.nextInt();

      if(digit == 0) { 
        break; }
      else { 
        list.add(digit); }  
    }

    scan.nextLine();
    scan.close();
 

    System.out.println("\nThe maximum value is: " + max(list));

  }

  public static Integer max(ArrayList<Integer> list){
        if (list.size() == 0)
          return null;
          
        Integer max = Collections.max(list);
          return max;
  }
 
}
