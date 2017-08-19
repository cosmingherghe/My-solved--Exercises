/**    
 * (Financial application: find the sales amount) Rewrite Programming Exercise
 * 5.39 as follows:
 * ■ Use a for loop instead of a do-while loop.
 * ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
  
public class HelloWorld {
	public static void main(String[] args) {
 	
		int baseSalary = 5000; 
		int percent = 0;
		double commission_sought; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the commission rate for any sell (eg. 0.5 for 5%):");
		commission_sought = input.nextDouble();
        
		for(int trySale = 1; ; trySale++ ){
		 	
			percent = 0;
			percent += trySale * commission_sought;
		
			System.out.println(trySale);
			
			if(baseSalary + percent >= 30000){ 
				System.out.println("Minimum sales you have to generate in order to make $30,000 is : " + trySale );
				break;
			}
		} 
    
	}
}
