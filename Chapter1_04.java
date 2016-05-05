
public class Chapter1_04 {

	/**
	 * Exercise 4 (Print table)
	 * a	a^2		a^3
	 * 1 	1		1
	 * 2	4		8
	 * 3	9		27
	 * 4	16		64
	 */
	
	public static void main(String[] args) {

		System.out.println("a \t a^2 \t a^3");
		
		for( int i=1; i<5; i++ ){
			
			System.out.println( i +" \t "+ (int)Math.pow(i, 2) + "\t" + (int)Math.pow(i, 3));
		}
	}
}

