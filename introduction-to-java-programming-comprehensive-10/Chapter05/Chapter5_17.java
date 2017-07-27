import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numberInt = input.nextInt();
		int count = numberInt;
		String lineOut = "";

		while(count > 0){
			
			for(int i = 1; i < count; i++){
				lineOut += "  ";
			}
			
			for(int j = count; j <= numberInt; j++){
				lineOut += " " + j;
			}
			
			for(int z = numberInt; z > count; z--){
				lineOut += " " + (z - 1);
			}
			
			lineOut += "\n";
			count--;
		}
		
		System.out.print( lineOut );
	}
}
