/**
*	(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
*	milliseconds to hours, minutes, and seconds using the following header:
*	
*	public static String convertMillis(long millis)
*	
*	The method returns a string as hours:minutes:seconds. For example,
*	convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
*	a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
*/
public class HelloWorld {
	public static void main(String[] args) {
		convertMillis(5500); //returns a string 0:0:5, 
		convertMillis(100000); //returns a string 0:1:40,
		convertMillis(555550000); 
	}
	
	public static String convertMillis(long millis) {
	
		long seconds = 0;
		long totalSeconds = 0;
		long minutes = 0;
		long totalMinutes = 0;
		long hours = 0;
		
		/** Get how many seconds are */
		if( (double)millis / 1000.0 >=1 ) 
			totalSeconds = (int)millis / 1000;
			seconds = totalSeconds % 60;
			
		/** Get how many minutes are */
		totalMinutes = totalSeconds / 60;
		minutes = totalMinutes % 60;
		
		/** Get how many hours are */
		hours = totalMinutes / 60;
		
		System.out.printf("%d:%d:%d\n",hours,minutes,seconds);
		String convertMillis = hours + ":" + minutes + ":" + seconds + "\n";
		return  convertMillis;
	}
}
