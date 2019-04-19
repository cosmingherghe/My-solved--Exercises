/*

(The Course class) Revise the Course class as follows:
 ■ The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger array and copying the contents of the 
current array to it.
 ■ Implement the dropStudent method.
 ■ Add  a  new  method  named clear()  that  removes  all  students  from  the  course.
Write  a  test  program  that  creates  a  course,  adds  three  students,  removes  one,  and displays the students in the course.

*/


import java.util.Arrays;

public class Main {
  public static void main(String[] args) { 
  
  	//Write  a  test  program  that  creates  a  course,  
  	Course math = new Course("Math");
  	
  	//adds  three  students,  
  	math.addStudent("Oliver");
  	math.addStudent("Jack");
  	math.addStudent("Harry");
 
 	//removes  one
 	math.dropStudent("Jack");

	//and displays the students in the course.
	for (String studentName : math.getStudents()){
		if(strTemp != null)
			System.out.println(studentName);
	} 
  }
}


class Course {

	private String courseName;

	private String[] students = new String[100];

	private int numberOfStudents;

	public Course(String courseName) {

		this.courseName = courseName;
	}

	public void addStudent(String student) {

		//automatically increase the array size by creating a new larger array and copying the contents of the current array to it.
		if(numberOfStudents == students.length)
			students = Arrays.copyOf(students, (students.length + 50));

		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	public String getCourseName() {
		return courseName;
	}

//Implement the dropStudent method.
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(student == students[i]){
				students[i] = null;
				break;
			}
		}
	}

	public void clear() {
		Arrays.fill(students, null);
	}
}
