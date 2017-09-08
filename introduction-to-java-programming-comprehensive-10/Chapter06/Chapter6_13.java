/**
*       (Sum series) Write a method to compute the following series:
*       m(i) = 1/2 + 2/3 + ... + i/(i+1)
*       
*       Write a test program that displays the following table:
*       i       m(i)
*       1       0.5000
*       2       1.1667
*       ...
*       19      16.4023
*       20      17.3546
*/

public class SumSeries {

	public static void main(String[] args) {
		
		sumSeries(20);
	}
	
	public static void sumSeries(int m) {
		
		System.out.println(" i \t    m(i) \n----------------");
		
		double sum = 0;
		for(int i = 1; i <= m; i++){
			
			for(int x = 1; x<=i; x++){
				
				sum += (double)x/(x+1);
			}//end for x
			
			System.out.printf("%2d \t %6.2f \n", i, sum);
		}//end for i
	}
}
