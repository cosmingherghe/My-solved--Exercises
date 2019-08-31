import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    
/**
(Use ArrayList) Write a program that creates an ArrayList and adds 
  a Loan object, a Date object, a string, and a Circle object to the list, and 
*/   
      
    ArrayList<Object> o = new ArrayList<Object>();
    o.add(new Loan());
    o.add(new java.util.Date());
    o.add(new String("A string object"));
    o.add(new Circle());

    //use a loop to display all the elements in the list by invoking the object’s toString() method.
    for (Object object : o) { 		      
           System.out.println("\n" + object.toString()); 		
    }
  
  }
}
