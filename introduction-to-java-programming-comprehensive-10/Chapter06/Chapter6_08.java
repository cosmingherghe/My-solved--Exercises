/**
*	(Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
*	
*	public static double celsiusToFahrenheit(double celsius) 
*	public static double fahrenheitToCelsius(double fahrenheit)
*	The formula for the conversion is:
*	fahrenheit = (9.0 / 5) * celsius + 32
*	celsius = (5.0 / 9) * (fahrenheit – 32)
*	Write a test program that invokes these methods to display the following tables:
*	Celsius 	Fahrenheit 	| Fahrenheit 	Celsius
*	40.0 		104.0 		| 120.0 	48.89
*	39.0 		102.2 		| 110.0 	43.33
*	...
*	32.0 		89.6 		| 40.0 		4.44
*	31.0 		87.8 		| 30.0 		-1.11
*/

import java.util.*;

public class ConversionsCelsiusFahrenheit {

	public static void main(String[] args) {
		
		System.out.println("Celsius \tFahrenheit \t| \tFahrenheit \tCelsius");
		System.out.println("---------------------------------------------------------------");
		
		for(int c = 40, f = 120; c > 30; c--, f -= 10){
			double celsius = c;
			double fahrenheit = f;
			System.out.printf( "%.1f \t\t %.1f \t\t| \t%.1f \t\t %.2f \n", 
					celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
		}

	}//End main method 
	
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}
