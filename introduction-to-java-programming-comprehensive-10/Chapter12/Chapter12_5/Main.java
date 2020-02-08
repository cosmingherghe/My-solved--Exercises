class Main {
  public static void main(String[] args) {

    try{
      Triangle tri1 = new Triangle(2.0, 4.0, 6.0);
    }
    catch(IllegalTriangleException ex) {
      System.out.println( ex.getMessage() );
    }

  } 
}
 
