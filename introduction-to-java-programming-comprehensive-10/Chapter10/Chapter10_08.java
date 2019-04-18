/*
(Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following instance data fields:
 ■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—
married filing jointly or qualifying widow(er), 2—married filing separately,
and 3—head of household. Use the public static constants SINGLE_FILER
(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 ■ int[][] brackets: Stores the tax brackets for each filing status.
 ■ double[] rates: Stores the tax rates for each bracket.
 ■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also provide a no-arg constructor and the constructor 
Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class.  Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in Table 10.1.
*/
 
public class Test {
 
	public static void main(String[] args) {  
		
		 double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};

		 String[] filer = { "United States Federal Personal Tax Rates", 
				 "-----------------------------------------------------",
				 "Taxable Income", "Single filer", "Married jointly", "Married separately", "Head of household" };

		 int[][] brackets = {
				  				{27050, 65550, 136750, 297350},	// Single filer
				  				{45200, 109250, 166500, 297350},	// Married jointly -or qualifying widow(er)
				  				{22600, 54625, 83250, 148675},	// Married separately
				  				{36250, 93650, 151650, 297350}	// Head of household 
		  					};
		 
		for (int year = 2000, taxableIncome = 50000; year < 2011; year++, taxableIncome += 1000) {
			System.out.printf("%d %s\n %s \n %-20s %d \n %-20s %.2f \n %-20s %.2f \n %-20s %.2f \n %-20s %.2f \n\n\n", 
					year, filer[0], filer[1], filer[2], taxableIncome
					, filer[3], new Tax(Tax.SINGLE_FILER, brackets, rates, taxableIncome).getTax()
					, filer[4], new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_, brackets, rates, taxableIncome).getTax()
					, filer[5], new Tax(Tax.MARRIED_SEPARATELY, brackets, rates, taxableIncome).getTax()
					, filer[6], new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, taxableIncome).getTax() 
					);
		}
	} 
}

 
class Tax {

	private int filingStatus;
	
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	Tax(int filingStatus,int[][] brackets, double[] rates, double  taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public int getFilingStatus() {
		return filingStatus;
	}
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	public int[][] getBrackets() {
		return brackets;
	}
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	public double[] getRates() {
		return rates;
	}
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	public static int getSingleFiler() {
		return SINGLE_FILER;
	}
	public static int getMarriedJointlyOrQualifyingWidow() {
		return MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_;
	}
	public static int getMarriedSeparately() {
		return MARRIED_SEPARATELY;
	}
	public static int getHeadOfHousehold() {
		return HEAD_OF_HOUSEHOLD;
	}
	
	public double getTax() { 
		double tax = 0;
		
		if (taxableIncome <= brackets[filingStatus][0])
			return  Math.round(taxableIncome * rates[0]); 

		tax += brackets[filingStatus][0] * rates[0];
		
		for (int i = 1; i < brackets.length; i++) { 
			
			if(taxableIncome <= brackets[filingStatus][i]) { 
					 tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
					 return Math.round(tax);
			}
			else
				tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i]; 
		}
		
		if(taxableIncome > brackets[filingStatus][brackets.length - 1])
			tax += (taxableIncome - brackets[filingStatus][brackets.length - 1]) * rates[brackets.length  - 1];

		return Math.round(tax); 
	}
	
}
