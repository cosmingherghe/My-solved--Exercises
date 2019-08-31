import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    ArrayList<Object> o = new ArrayList<Object>();
    o.add(new Loan());
    o.add(new java.util.Date());
    o.add(new Circle());

    for (Object object : o) { 		      
           System.out.println("\n" + object.toString()); 		
    }
  
  }
}
