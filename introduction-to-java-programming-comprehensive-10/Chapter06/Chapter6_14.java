import java.lang.*;

public class HelloWorld {
  public static void main(String[] args) {
  
  	System.out.printf("  i \t m(i) \n ---------------\n");
  	for(int i=1; i<1000;i+=100){
		System.out.printf("%3d \t %6f \n", i, estimatePi(i));
	}
  }
  
  public static double estimatePi(int m) { 
  	double estimatePi = 0;
  	
	public static double estimatePi(int m) {
		double estimatePi = 0;
		  	
		for(int i=1; i<=m;i++){
			estimatePi += Math.pow(-1, i + 1)/((double)2 * i - 1);
		}  
		return 4 * estimatePi; 
	}
  }
}
