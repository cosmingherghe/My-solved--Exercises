public class Circle extends GeometricObject {
	
	double radius;

	Circle() { 
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius; 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/* Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/* Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/* Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
	}
 
}
