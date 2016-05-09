import java.util.Scanner;


public class Chapter2_19 {
	/**
	 *		Geometry: area of a triangle
	 *
	 *		area = (Ax(By − Cy) + Bx(Cy − Ay) + Cx(Ay − By))/2
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println( "Exemple three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4" +
							"\nEnter three points for a triangle: ");

		double ax = input.nextDouble();
		double ay = input.nextDouble();
		double bx = input.nextDouble();
		double by = input.nextDouble();
		double cx = input.nextDouble();
		double cy = input.nextDouble();
		
		double area = ( ax * (by - cy) + bx * (cy - ay) + cx * (ay - by) )/2;
		
		System.out.println( "The area of the triangle is: " + area );

	}
}