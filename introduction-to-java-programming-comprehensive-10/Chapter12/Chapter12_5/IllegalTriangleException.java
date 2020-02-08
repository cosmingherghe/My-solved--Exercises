public class IllegalTriangleException extends Exception {

  double side1, side2, side3;

  /** Construct a triangle with the specified sides
  In a triangle, the sum of any two sides is greater than the other side */
      
  public IllegalTriangleException(double side1, double side2, double side3) {
        super("\n\nInvalid side lenght: In a triangle, the sum of any two sides is greater than the other side. \nThe 3 sides entered are: " + side1 +" / " + side2 + " / " + side3 + ". \nPlease review.\n\n");

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
  }

  public double getSide1() {
    return side1;
  } 

  public double getSide2() {
    return side2;
  }

  public double getSide3() {
    return side3;
  }
}
