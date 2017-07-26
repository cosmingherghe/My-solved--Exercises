public class HelloWorld {
	public static void main(String[] args) {
	  
		Scanner input = new Scanner(System.in);
		int d = 0;
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		d = (n2>n1) ? n1 : n2; // First find d to be the minimum of n1 and n2

		while(d > 0) {
			d--;
			if(n1%d == 0 && n2%d == 0) {
				break;
			}
		}
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);

	}
}
