import java.util.ArrayList;

public class Course {
  private String courseName; 
  ArrayList<String> students = new ArrayList<String>();
  private int numberOfStudents;
 
  public Course(String courseName) {
    this.courseName = courseName;
  }
 
  public void addStudent(String student) {
    students.add(student);
    numberOfStudents++;
  }

  public ArrayList<String> getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return  students.size();
  }

  public String getCourseName() {
    return courseName;
  } 

  public void dropStudent(String student) {
		if(students.contains(student)){
      students.remove(students.indexOf(student));
    }
    else{
      System.out.println("This student is not on the list.");
    }
	}

}
