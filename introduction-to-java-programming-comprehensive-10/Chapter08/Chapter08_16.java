import java.util.Arrays;

/**
 * 	(Sort two-dimensional array) Write a method to sort a two-dimensional array
	using the following header:
	
	public static void sort(int m[][])
	
	The method performs a primary sort on rows and a secondary sort on columns.
	For example, the following array
	
	{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
	
	will be sorted to
	
	{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 
 */
public class SortTwoDimensionalArray {

	public static void main(String[] args) { 

		int[][] unsortedArray = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

		System.out.println("Unsorted array:\t" + Arrays.deepToString(unsortedArray));

		sort(unsortedArray);
	}
	
	public static void sort(int m[][]) {
		
		// Swap First Index
		for (int i = 0; i < m.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin0 = m[i][0];
			int currentMin1 = m[i][1];
			int currentMinIndex = i;
		
			for (int j = i + 1; j < m.length; j++) {
				if (currentMin0 > m[j][0]) {
					currentMin0 = m[j][0];
					currentMin1 = m[j][1];
					currentMinIndex = j;
				}
			}
		
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
					m[currentMinIndex][0] = m[i][0];
					m[currentMinIndex][1] = m[i][1];
					m[i][0] = currentMin0;
					m[i][1] = currentMin1;
			}
		}
		
		// Swap Second Index
		
		for (int i = 0; i < m.length - 1; i++) {
			int sameNumber = 0;
			for (int j = i + 1; j < m.length; j++) {
				if(m[i][0] == m[j][0])
					sameNumber++;
			}
			i += sameNumber;
			
			//Swap Second Index
			if(sameNumber > 0) {
				
				for (int s = i - sameNumber; s < i; s++) {
						 // Find the minimum in the list[i..list.length-1]
						 int currentMin = m[s][1];
						 int currentMinIndex = s;
						
					for (int f = s + 1; f < i + 1; f++) {
						 if (currentMin > m[f][1]) {
							 currentMin = m[f][1];
							 currentMinIndex = f;
						}
					}
						
					// Swap list[i] with list[currentMinIndex] if necessary
					if (currentMinIndex != s) {
						 m[currentMinIndex][1] = m[s][1];
						 m[s][1] = currentMin;
					}
				}
			}
		}

		//display sorted array
		System.out.println("Sorted array:\t" + Arrays.deepToString(m));
	}

}
