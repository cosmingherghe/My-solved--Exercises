import java.util.Scanner;

public class Chapter2_18 {
	/**
	 *		Geometry: area of a hexagon
	 */
	public static void main(String[] args) {

		System.out.println( "a \tb \tpow(a, b)");

		for( int i = 1; i<6; i++) {

			System.out.println( i + " \t" + (i+1) + " \t" + (int)Math.pow(i, i+1) );
		}
	}
}