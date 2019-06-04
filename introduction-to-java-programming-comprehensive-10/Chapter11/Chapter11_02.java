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
         
        //Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

        //Create a Person
        Person test1 = new Person("Dwayne Johnson", "Southwest Ranches, Florida, US", "014545454545", "dwaynejohnson@gmail.com");
        
        //Create a Student,
        Person test2 =  new Student("Rachel Meghan Markle", "Los Angeles, California, U.S.", "01232323244", "rachelmeghan@gmail.com", 2); 
        
        //Create a Employee, 
        Person test3 =  new Employee("Trevor Engelson", "Great Neck, New York, U.S.", "01567884611", "trevorengelson@gmail.com", "1st Floor A2", 100000.00);
        
        
        //Create a Faculty, 
        Person test4 = new Faculty("Jennifer Ann McCarthy", "Evergreen Park, Illinois, U.S.", "010424648841", "jenniferann@gmail.com", "3rd Floor B6", 200000.00, "07:00-15:00", "Professor"); 
        
        
        //Create a Staff,
        Person test5 = new Staff("Anna Nicole Smith", "Evergreen Park, Illinois", "01555588884", "annanicole@gmail.com", "2nd Floor A6", 130222.25, "Assistant Professor");
        
        
        System.out.println( "Class: " + test1.getClass().getName() + "\n" + test1.toString() + "\n");
        
        System.out.println( "Class: " + test2.getClass().getName() + "\n" + test2.toString() + "\n");
        
        System.out.println( "Class: " + test3.getClass().getName() + "\n" + test3.toString() + "\n");
        
        System.out.println( "Class: " + test4.getClass().getName() + "\n" + test4.toString() + "\n");
        
        System.out.println( "Class: " + test5.getClass().getName() + "\n" + test5.toString() + "\n");
        
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
    
    public String toString() { 
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber + "\nEmail Address: " + this.emailAddress + "\n";
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
    
    @Override
    public String toString() { 
        return super.toString() + "Student Status: " + status.get(StudentStatus) + "\n";
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
    
    @Override
    public String toString() { 
        return super.toString() + "Student Status: " + "\nOffice: " + this.office + "\nSalary: " + this.salary + "\nDate Hired: " + dateHired + "\n";
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
    
    @Override
    public String toString() { 
        return super.toString() + "Office Hours: " + this.officeHours + "\nRank: " +  this.rank + "\n";
    }
}


// A staff member has a title.
class Staff extends Employee {
    private String title;

    Staff (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title; 
    }
    
    @Override
    public String toString() { 
        return super.toString() + "Title: " + this.title + "\n";
    }
}
