/*
(The Rectangle class @386) Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40, and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
*/

class Main {
  public static void main(String[] args) {

    Rectangle rect1 = new Rectangle(4,40);
    Rectangle rect2 = new Rectangle(3.5,35.9);

    System.out.printf("Rectangle 1 :\n width: %-10s\n height: %-10s\n area: %-10s\n perimeter: %-10s\n\n", rect1.getWidth(), rect1.getHeight(), rect1.getArea(), rect1.getPerimeter());
    System.out.printf("Rectangle 2 :\n width: %-10s\n height: %-10s\n area: %-10s\n perimeter: %-10s\n", rect2.getWidth(), rect2.getHeight(), rect2.getArea(), rect2.getPerimeter());
  }

}

class Rectangle{
  //Two double data fields that specify the width and height of the rectangle. 
  private double width = 1;
  private double height = 1;

  //A no-arg constructor that creates a default rectangle.
  public Rectangle() {

  }

  //A constructor that creates a rectangle with the specified width and height.
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  //A method named getArea() that returns the area of this rectangle.
  public double getArea() {
    return this.width * this.height;
  }

  //A method named getPerimeter() that returns the perimeter.
  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }



}
