import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year =  input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1-31:");
        int day = input.nextInt();

        if(month == 1) {
            month = 13;
            year -= 1;
        }
        else if(month == 2) {
            month = 14;
            year -= 1;
        }

        int weekday = ( day + ( (26*(month+1) )/10 ) + (year%100) + ((year%100)/4) + ((year/100)/4) + ((year/100)*5) ) % 7;

        String dayAnswer = null;
        switch (weekday) {
            case 0: dayAnswer = "Saturday";
                break;
            case 1: dayAnswer = "Sunday";
                break;
            case 2: dayAnswer = "Monday";
                break;
            case 3: dayAnswer = "Tuesday";
                break;
            case 4: dayAnswer = "Wednesday";
                break;
            case 5: dayAnswer = "Thursday";
                break;
            case 6: dayAnswer = "Friday";
                break;
        }

        System.out.println("Day of the week is " + dayAnswer);
    }
}
