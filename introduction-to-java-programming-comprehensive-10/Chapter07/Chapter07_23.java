/** (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 *  closed on the first day of school. As the students enter, the first student, denoted
 *  S1, opens every locker. Then the second student, S2, begins with the second
 *  locker, denoted L2, and closes every other locker. Student S3 begins with the
 *  third locker and changes every third locker (closes it if it was open, and opens it if
 *  it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 *  Student S5 starts with L5 and changes every fifth locker, and so on, until student
 *  S100 changes L100.
 *  After all the students have passed through the building and changed the lockers,
 *  which lockers are open? Write a program to find your answer and display all
 *  open locker numbers separated by exactly one space.
 *  (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 *  locker is open (true) or closed (false). Initially, all lockers are closed.)
 */

class Main {
    public static void main(String[] args) {
		/** Generate 100 lockers closed on the first day of school */
		boolean[] lockers = getLockers(100); 
		
        /** do what first & second stundet does */
		for(int i = 0; i < 2; i++){ 
                reverseLockersState(lockers, i);   
		}
        
        /** do what the rest of stundets would do */
		for(int i = 2; i < 100; i++){ 
                reverseLockersState(lockers, i, i);   
		}
        
        for(int i = 0; i < 100; i++){ 
                System.out.println(lockers[i]); 
		}
        
        
	}
	
	public static boolean[] getLockers(int numberOfLockers) {
		boolean[] newLockers = new boolean[numberOfLockers];
		return newLockers;
	}
	
    /** begins with Student Number to change every locker */
	public static void reverseLockersState(boolean[] lockers, int startAtLocker) {
		for(int i = startAtLocker; startAtLocker < lockers.length; startAtLocker++){
			lockers[startAtLocker] = !lockers[startAtLocker];
		}
	}
    
    /** begin with Student Number to change every StudentNumber locker */
    public static void reverseLockersState(boolean[] lockers, int startAtLocker, int intervalStudentNumber) {
		for(int i = startAtLocker; startAtLocker < lockers.length; startAtLocker += intervalStudentNumber){
			lockers[startAtLocker] = !lockers[startAtLocker];
		}
	}
    
    
}
