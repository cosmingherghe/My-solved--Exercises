# CHAPTER SUMMARY
1. You can define a new class from an existing class. This is known as class inheritance. The new class is called a subclass, child class, or extended class. The existing class is called a superclass, parent class, or base class.
2. A constructor is used to construct an instance of a class. Unlike properties and methods, the constructors of a superclass are not inherited in the subclass. They can be invoked only from the constructors of the subclasses, using the keyword super.
3. A constructor may invoke an overloaded constructor or its superclass’s constructor. The call must be the first statement in the constructor. If none of them is invoked explicitly, the compiler puts super() as the first statement in the constructor, which invokes the superclass’s no-arg constructor.
4. To override a method, the method must be defined in the subclass using the same signature and the same return type as in its superclass.
5. An instance method can be overridden only if it is accessible. Thus, a private method cannot be overridden because it is not accessible outside its own class. If a method defined in a subclass is private in its superclass, the two methods are completely unrelated.
6. Like an instance method, a static method can be inherited. However, a static method cannot be overridden. If a static method defined in the superclass is redefined in a subclass, the method defined in the superclass is hidden.
7. Every class in Java is descended from the java.lang.Object class. If no superclass is specified when a class is defined, its superclass is Object.
8. If a method’s parameter type is a superclass (e.g., Object), you may pass an object to this method of any of the parameter’s subclasses (e.g., Circle or String). This is known as polymorphism.
9. It is always possible to cast an instance of a subclass to a variable of a superclass, because an instance of a subclass is always an instance of its superclass. When casting an instance of a superclass to a variable of its subclass, explicit casting must be used to confirm your intention to the compiler with the (SubclassName) cast notation.
10. A class defines a type. A type defined by a subclass is called a subtype and a type defined by its superclass is called a supertype.
11. When invoking an instance method from a reference variable, the actual type of the variable decides which implementation of the method is used at runtime. This is known as dynamic binding.
12. You can use obj instanceof AClass to test whether an object is an instance of a class.
13. You can use the ArrayList class to create an object to store a list of objects.
14. You can use the protected modifier to prevent the data and methods from being accessed by nonsubclasses from a different package.
15. You can use the final modifier to indicate that a class is final and cannot be extended and to indicate that a method is final and cannot be overridden.
