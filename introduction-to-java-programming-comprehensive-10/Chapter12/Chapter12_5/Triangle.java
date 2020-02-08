class Triangle extends SimpleGeometricObject {
    //three sides of the triangle.
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;  
    
    // ■ A no-arg constructor that creates a default triangle.
    public Triangle(){ 
    }
    
    //■ A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3) 
      throws IllegalTriangleException {
        if( (side1 + side2) <= side3 || (side2 + side3) <= side1 || (side3 + side1) <= side2 )
          throw new IllegalTriangleException(side1, side2, side3);

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
