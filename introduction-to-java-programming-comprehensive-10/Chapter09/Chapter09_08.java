/* 
(The Fan class) Design a class named Fan to represent a fan. The class contains:
■■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
■■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
■■ A private boolean data field named on that specifies whether the fan is on (the default is false).
■■ A private double data field named radius that specifies the radius of the fan (the default is 5).
■■ A string data field named color that specifies the color of the fan (the default is blue).
■■ The accessor and mutator methods for all four data fields.
■■ A no-arg constructor that creates a default fan.
■■ A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
Draw the UML diagram for the class then implement the class. Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the second object. Display the objects by invoking their toString method.
*/
 

class Main {
  public static void main(String[] args) {

    //creates two Fan objects. 
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();

    //Assign maximum speed, radius 10, color yellow, and turn it on to the first object. 
    fan1.setSpeed(Fan.FAST);
    fan1.setColor("yellow");
    fan1.setOn(true);

    //Assign medium speed, radius 5, color blue, and turn it off to the second object.
    fan1.setSpeed(Fan.MEDIUM); 

    //Display the objects by invoking their toString method.
    System.out.println( fan1.toString() );
    System.out.println( fan2.toString() );
  }
}

class Fan{

  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;
  private int speed = SLOW;
  private boolean on = false;
  private double radius = 5;
  private String color = "blue";

  //accessor and mutator methods for all four data fields
  public int getSpeed(){
    return speed;
  }

  public boolean getOn(){
    return on;
  }

  public double getRadius(){
    return radius;
  }

  public String getColor(){
    return color;
  }

  public void setSpeed(int speed){
    this.speed = speed;
  }
 
  public void setOn(boolean on){
    this.on = on;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public void setColor(String color){
    this.color = color;
  }

  //A no-arg constructor that creates a default fan.
  Fan(){

  }

  public String toString() {
 
    return  on ? "The fan is on, fan speed: " + speed + ", color: " + color + ", radius: " + radius :  "The fan is off, color: " + color + ", radius: " + radius;
  }

}
