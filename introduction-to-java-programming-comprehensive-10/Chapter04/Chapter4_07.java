import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  double Ax,Ay,Bx,By,Cx,Cy,Dx,Dy,Ex,Ey;
	int angle, radius;

	Scanner input = new Scanner(System.in);  	

	System.out.print("Enter the radius of the bounding circle: ");
	radius = input.nextInt();
	
	angle = 10;
	System.out.println(" \u2220 A = " + angle + (char)176);

	Ax = radius * Math.cos( Math.toRadians(angle) );
	Ay = radius * Math.sin( Math.toRadians(angle) );
	
	angle += 72;
	System.out.println(" \u2220 B = " + angle + (char)176);

	Bx = radius * Math.cos( Math.toRadians(angle) );
	By = radius * Math.sin( Math.toRadians(angle) );
	
	angle += 72;
	System.out.println(" \u2220 C = " + angle + (char)176);

	Cx = radius * Math.cos( Math.toRadians(angle) );
	Cy = radius * Math.sin( Math.toRadians(angle) );
	
	angle += 72;
	System.out.println(" \u2220 D = " + angle + (char)176);

	Dx = radius * Math.cos( Math.toRadians(angle) );
	Dy = radius * Math.sin( Math.toRadians(angle) );
	
	angle += 72;
	System.out.println(" \u2220 E = " + angle + (char)176);

	Ex = radius * Math.cos( Math.toRadians(angle) );
	Ey = radius * Math.sin( Math.toRadians(angle) );
	 
	
	System.out.println("The coordinates of five points on the pentagon are:\nA: (" + Ax + ", " + Ay + ")\nB: (" + Bx + ", " + By + ")\nC: (" + Cx + ", " + Cy + ")\nD: (" + Dx + ", " + Dy + ")\nE: (" + Ex + ", " + Ey + ")" );  }
}
