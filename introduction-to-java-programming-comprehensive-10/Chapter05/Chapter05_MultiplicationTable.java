public class MultiplicationTable{
  public static void main(String[] args) {
  
  	System.out.println("  |          Multiplication Table         |");
	System.out.print("  | ");

	for(int j=1; j<10; j++){
		System.out.print("   " + j);
		if(j==9)System.out.print("  |");
	}
	
	System.out.print("\n——|———————————————————————————————————————|");

	for(int i=1;i<10;i++) {
		System.out.print("\n" + i + " | ");
		for(int j = 1; j<10; j++){
			System.out.printf("%4d", j * i);
			if(j==9)System.out.print("  |");
		}
	}
	System.out.print("\n——|———————————————————————————————————————|");
  }
}
