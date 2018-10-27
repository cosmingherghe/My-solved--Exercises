class Main {
  public static void main(String[] args) {

    MyPoint p1 = new MyPoint();
    MyPoint p2 = new MyPoint(10, 10.5); 
    
    System.out.println("Distance: " + MyPoint.distance(p1, p2));
  }
}

/*
(The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
■■ The data fields x and y that represent the coordinates with getter methods.
■■ A no-arg constructor that creates a point (0, 0).
■■ A constructor that constructs a point with specified coordinates.
■■ A method named distance that returns the distance from this point to a specified point of the MyPoint type.
■■ A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
■■ A static method named distance that returns the distance from two MyPoint objects.
Draw the UML diagram for the class then implement the class. Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
*/

class MyPoint {

  private double x;
  private double y;

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  MyPoint(){
    this.x = 0;
    this.y = 0;
  }

  MyPoint(double x, double y){
    this.x = x;
    this.y = y;
  } 

  public double distance(double x, double y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

  public double distance(MyPoint point) {
		return point.distance(x, y);
	}

  public static double distance(MyPoint point1, MyPoint point2) {
		return point1.distance(point2.getX(), point2.getY());
	}

}
