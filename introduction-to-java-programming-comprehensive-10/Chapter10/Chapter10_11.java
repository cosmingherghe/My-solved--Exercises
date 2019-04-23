/*
(Geometry: the Circle2D class) Define the Circle2D class that contains:
 ■ Two double data fields named x and y that specify the center of the circle
with getter methods.
 ■ A data field radius with a getter method.
 ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
 ■ A constructor that creates a circle with the specified x, y, and radius.
 ■ A method getArea() that returns the area of the circle.
 ■ A method getPerimeter() that returns the perimeter of the circle.
 ■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
 ■ A method contains(Circle2D circle) that returns true if the specified circle is 
 inside this circle (see Figure 10.21b).
 ■ A method overlaps(Circle2D circle) that returns true if the specified circle 
 overlaps with this circle (see Figure 10.21c).
 
Draw the UML diagram for the class and then implement the class. Write a test
program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3,
3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)).
*/
 
public class Test {
 
	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(2, 2, 5.5); 
		System.out.println( "c1 perimeter is: " + c1.getPerimeter() );
		
		System.out.println( "\nc1.contains(3,3) = " + c1.contains(3,3) ); 
		
		System.out.println( "\nc1.contains(new Circle2D(4, 5, 10.5)) = " + c1.contains(new Circle2D(4, 5, 10.5)) );
		
		System.out.println( "\nc1.overlaps(new Circle2D(3, 5, 2.3)) = " + c1.overlaps(new Circle2D(3, 5, 2.3)) );
	}
}

class Circle2D {

	private double x;
	private double y;
	private double radius;
	
	Circle2D(double x, double y){
		this.x = x;
		this.y = y;
		this.radius = 1;
	}
	
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	} 
	public double getY() {
		return y;
	} 
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//returns the area of the circle
	public double getArea() {
		return Math.PI * this.radius;
	}
	
	//returns the perimeter of the circle
	public double getPerimeter() {
		return Math.sqrt( 4 * Math.PI * getArea() );
	}

	//returns true if the specified point (x, y) is inside this circle
	public boolean contains(double x, double y) {
        //distance between the two centers
        double distance = Math.sqrt(Math.pow( (x-this.x),2) + Math.pow( (y-this.y),2) );

        //The point (xp,yp) is inside the circle if d<r, on the circle if d=r, and outside the circle if d>r.
        return distance < this.radius;
	}
	
	//returns true if the specified circle is inside this circle
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow( (circle.x - this.x),2) + Math.pow( (circle.y - this.y),2) );
		
		return distance <= Math.abs(this.radius - circle.radius);
	}
	
	//returns true if the specified circle is inside this circle
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow( (circle.x - this.x),2) + Math.pow( (circle.y - this.y),2) );
		
		return distance <= (this.radius + circle.radius);
	}	
	
}
