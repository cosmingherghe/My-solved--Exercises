// (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double seconds = System.currentTimeMillis()/1000;
        int second = (int)seconds%60; 	// second
        double minutes = seconds/60; 	// minutes
        int minut =  (int)minutes%60; 	// minute
        double hours = minutes/60; 		// hours
        int hour = (int)hours%24;		// hour

        System.out.print("Enter the time zone offset to GMT: ");

        hour += input.nextInt(); //reading zone

        if(hour<0) hour = Math.abs(hour);  // make a negative hour positive

        if(hour>12){
            System.out.println(" The current time is: " + (hour % 12) + ":" + minut + ":" + second + " p.m.");
        }else{
            System.out.println(" The current time is: " + hour + ":" + minut + ":" + second + " a.m.");
        }

    }
}
