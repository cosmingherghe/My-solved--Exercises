/** (Compute the weekly hours for each employee) Suppose the weekly hours for all
  * employees are stored in a two-dimensional array. Each row records an employee’s
  * seven-day work hours with seven columns. For example, the following
  * array stores the work hours for eight employees. Write a program that displays
  * employees and their total hours in decreasing order of the total hours.
  */



public class EmployeeWeeklyHours{
	/** Main method */
	public static void main(String[] args) {
		// seven-day work hours with seven columns
		int[][] employee = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}};
 
		int[][] weeklyHours = getWeeklyHours(employee);

		sortEmployeeDecreasingOrder(weeklyHours);

		for (int listWeeklyHoursDecreasingOrder = 0; listWeeklyHoursDecreasingOrder < weeklyHours.length; listWeeklyHoursDecreasingOrder ++) {

			System.out.println( "Weekly Hours: " + weeklyHours[listWeeklyHoursDecreasingOrder][1]
						+ "  Employee: " + ( weeklyHours[listWeeklyHoursDecreasingOrder][0] + 1 ) );
		}

	}

	public static int[][] getWeeklyHours(int[][] hours) {
		// Employee Weekly Hours
		int[][] totalWeeklyHours = new int[hours.length][2]; // employee [i][{Employee number, WeeklyHours}]
 
		// Compute the weekly hours for each employee
		for (int i = 0; i < hours.length; i++) {
			// hours for each employee
			int weeklyHours = 0;
			for (int j = 0; j < hours[i].length; j++) {
				weeklyHours += hours[i][j];
			}
			totalWeeklyHours[i][0] = i;  // add employee number
			totalWeeklyHours[i][1] = weeklyHours; // add weekly hours
		}
		return totalWeeklyHours;
	}

	/** The method for sorting the numbers */ 
	public static void sortEmployeeDecreasingOrder(int[][] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the Maximum in the list[i..list.length-1]
			int[][] currentMax = new int[1][2];
			        currentMax[0][1] = list[i][1];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax[0][1] < list[j][1]) {
					currentMax[0][0] = list[j][0];
					currentMax[0][1] = list[j][1];
					currentMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMaxIndex] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex][0] = list[i][0];
				list[currentMaxIndex][1] = list[i][1];

				list[i][0] = currentMax[0][0];
				list[i][1] = currentMax[0][1];
			}
		}
	} 
}
