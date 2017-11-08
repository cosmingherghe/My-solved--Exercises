import java.util.Arrays;

/**
	(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
	array using the following header:
		
	public static void shuffle(int[][] m)
	
	Write a test program that shuffles the following matrix:
		
	int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 */
public class ShuffleRows {

	public static void main(String[] args) {

		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		
		System.out.println("Array:\t\t\t" + Arrays.deepToString(m) + "\n");
		shuffle(m);
		System.out.println("Array shuffle rows:\t" + Arrays.deepToString(m));
	}
	
	public static void shuffle(int[][] m) {
		
		int temp;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				temp = m[i][j];
				int random = (int )(Math.random() * m[i].length);
				m[i][j] = m[i][random];
				m[i][random] = temp;
			} 
		}
	}

}
