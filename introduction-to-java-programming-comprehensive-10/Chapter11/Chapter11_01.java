/*
(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
 ■ A no-arg constructor that creates a default triangle.
 ■ A constructor that creates a triangle with the specified side1, side2, and
side3.
 ■ The accessor methods for all three data fields.
 ■ A method named getArea() that returns the area of this triangle.
 ■ A method named getPerimeter() that returns the perimeter of this triangle.
 ■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:

    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

    Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
*/


public class Main{

     public static void main(String []args){
     
        Triangle tri1 = new Triangle(3.2, 5.4, 2.6);
        
        tri1.setColor("red");
        tri1.setFilled(true);
        
        System.out.printf("%s \n Color: %s\n Is filled: %b%n" , tri1.toString(), tri1.getColor(), tri1.isFilled() );
     }
}



class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
 
    /** Construct a default geometric object */
    public GeometricObject() {    
        dateCreated = new java.util.Date();
        
    }

    /** Construct a geometric object with the specified color and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean, 30 its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {   
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    //three sides of the triangle.
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;  
    
    // ■ A no-arg constructor that creates a default triangle.
    public Triangle(){ 
    }
    
    //■ A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // ■ The accessor methods for all three data fields.
    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    // ■ A method named getArea() that returns the area of this triangle.
    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3) );
    }

    // ■ A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    
    // ■ A method named toString() that returns a string description for the triangle.
    public String toString(){
        return "Triangle:\n side1 = " + side1 + "\n side2 = " + side2 + "\n side3 = " + side3 + "\n area = " + getArea() + "\n perimeter = " + getPerimeter();
    }
}
