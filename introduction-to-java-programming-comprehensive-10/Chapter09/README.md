# CHAPTER SUMMARY
1. A class is a template for objects. It defines the properties of objects and provides constructors for creating objects and methods for manipulating them.
2. A class is also a data type. You can use it to declare object reference variables. An object reference variable that appears to hold an object actually contains a reference to that object. Strictly speaking, an object reference variable and an object are different, but most of the time the distinction can be ignored.
3. An object is an instance of a class. You use the new operator to create an object, and the dot operator (.) to access members of that object through its reference variable.
4. An instance variable or method belongs to an instance of a class. Its use is associated with individual instances. A static variable is a variable shared by all instances of the same class. A static method is a method that can be invoked without using instances.
5. Every instance of a class can access the class’s static variables and methods. For clarity, however, it is better to invoke static variables and methods using ClassName.variable and ClassName.method.
6. Visibility modifiers specify how the class, method, and data are accessed. A public class, method, or data is accessible to all clients. A private method or data is accessible only inside the class.
7. You can provide a getter (accessor) method or a setter (mutator) method to enable clients to see or modify the data.
8. A getter method has the signature public returnType getPropertyName(). If the returnType is boolean, the get method should be defined as public boolean isPropertyName(). A setter method has the signature public void setPropertyName(dataType propertyValue).
9. All parameters are passed to methods using pass-by-value. For a parameter of a primitive type, the actual value is passed; for a parameter of a reference type, the reference for the object is passed.
10. A Java array is an object that can contain primitive type values or object type values. When an array of objects is created, its elements are assigned the default value of null.
11. Once it is created, an immutable object cannot be modified. To prevent users from modifying an object, you can define immutable classes.
12. The scope of instance and static variables is the entire class, regardless of where the variables are declared. Instance and static variables can be declared anywhere in the class. For consistency, they are declared at the beginning of the class in this book.
13. The keyword this can be used to refer to the calling object. It can also be used inside a constructor to invoke another constructor of the same class.
