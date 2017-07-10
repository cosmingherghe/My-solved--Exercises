import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {
  
      String employeeName;
    	double hoursPerWeek, hourlyPayRate, federalTax, stateTax, GrossPay, FederalWithholding, StateWithholding, NetPay;
    	
  	Scanner input = new Scanner(System.in);
  	DecimalFormat df = new DecimalFormat("0.00##");
  	
  	System.out.print("Enter employe's name (e.g., Smith):  ");	
  	employeeName = input.nextLine();
  	
  	System.out.print("Enter number of hours worked in a week (e.g., 10): ");	
  	hoursPerWeek = input.nextDouble();
  	
  	System.out.print("Enter hourly pay rate (e.g., 9.75): ");	
  	hourlyPayRate = input.nextDouble();
  	 
  	System.out.print("Enter federal tax withholding rate (e.g., 0.20 for 20%): ");	
  	federalTax = input.nextDouble();
  	
  	System.out.print("Enter state tax withholding rate (e.g., 0.09 for 9%): ");	
  	stateTax = input.nextDouble();
  	
  	GrossPay = hourlyPayRate * hoursPerWeek;
  	FederalWithholding = GrossPay * federalTax;
  	StateWithholding = GrossPay * stateTax;
  	NetPay = GrossPay - ( FederalWithholding + StateWithholding );
  	
  	
  	System.out.print( "\nEmployee Name: " + employeeName + 
  				"\nHours Worked: " + hoursPerWeek + 
  				"\nPay Rate: $" + hourlyPayRate + 
  				"\nGross Pay: $" + String.format("%.2f", GrossPay) + 
  				"\nDeductions: \nFederal Withholding (" + (100 * federalTax) + "%): $" + String.format("%.2f", FederalWithholding) + 
  				"\nState Withholding (" + (100 * stateTax) + "%): $" +  String.format("%.2f", StateWithholding)   + 
  				"\nTotal Deduction: $" + String.format("%.2f", GrossPay) + 
  				"\nNet Pay: $" + String.format("%.2f", NetPay) );
  }
}
