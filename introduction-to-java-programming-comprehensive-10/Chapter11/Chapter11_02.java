/*
    (The Person, Student, Employee, Faculty, and Staff classes) 
    Design a class named Person and its two subclasses named Student and Employee.
    
    Make Faculty and Staff subclasses of Employee. 
    
    A person has a name, address, phone number, and email address. 
    A student has a class status (freshman, sophomore, junior, or senior). 
        Define the status as a constant. 
        
    An employee has an office, salary, and date hired. 
???>    Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
    A faculty member has office hours and a rank. 
    A staff member has a title. 
        Override the toString method in each class to display the class name and the person’s name.
        
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.
*/

import java.util.*;

public class HelloWorld{

     public static void main(String []args){ 
         
        //System.out.printf("%s \n Color: %s\n Is filled: %b%n" , tri1.toString(), tri1.getColor(), tri1.isFilled() );
     }
}

/* Design a class named Person
A person has a name, address, phone number, and email address. */
class Person {
    private String name, address, phoneNumber, emailAddress;
    
    public Person( String name, String address, String phoneNumber, String emailAddress ){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
}

// Person and its two subclasses named Student and Employee.
// A student has a class status (freshman, sophomore, junior, or senior).        Define the status as a constant. 
class Student extends Person {

    private static final List<String> status = Collections.unmodifiableList(Arrays.asList("Freshman", "Sophomore", "Junior", "Senior"));
    private int StudentStatus = 1;
    
    public Student (String name, String address, String phoneNumber, String emailAddress, int StudentStatus){
        super(name, address, phoneNumber, emailAddress);
        this.StudentStatus = StudentStatus;
    }
    
    public String getStudentStatus(){
        return status.get(StudentStatus);
    }
    
    public void setStudentStatus(int StudentStatus){
        this.StudentStatus = StudentStatus;
    }
}  

// An employee has an office, salary, and date hired.
class Employee extends Person {
    private String office;
    private double salary;
    private java.util.Date dateHired;
    
    Employee (String name, String address, String phoneNumber, String emailAddress, String office, double salary){
        super(name, address, phoneNumber, emailAddress); 
        this.office = office;
        this.salary = salary;
        dateHired = new java.util.Date();
    }
}

//Make Faculty and Staff subclasses of Employee. 
//A faculty member has office hours and a rank. 
class Faculty extends Employee {
    private String officeHours; //Format HH:mm-HH:mm  <Eg. 07:00-15:00
    private String rank;
    
    Faculty (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String officeHours, String rank){
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}


// A staff member has a title.
class Staff extends Employee {
    private String title;

    Staff (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title; 
    }
}
