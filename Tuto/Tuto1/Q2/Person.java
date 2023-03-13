
package Tuto1.Q2;

class Person 
{
    public Person() 
    { 
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person
{ 
    public Employee() 
    { 
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    
    public Employee(String s) 
    { 
        System.out.println(s);
    }
}

class Faculty extends Employee 
{ 
    public Faculty() 
    { 
        System.out.println("(4) Performs Faculty's tasks"); 
    } 
    
    public static void main(String[] args) 
    { 
        new Faculty(); 
    }
}

/*
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks

Explanation:
The main method creates a new Faculty object.
The Faculty constructor is called, which is a constructor of the Employee class because Faculty extends Employee.
The Employee constructor is called because it is the default constructor of the Employee class and the Faculty constructor does not explicitly call a superclass constructor.
The Employee constructor calls the overloaded constructor that takes a string parameter, passing it the string "(2) Invoke Employee's overloaded constructor".
The string "(2) Invoke Employee's overloaded constructor" is printed to the console.
Control returns to the Employee constructor, which prints the string "(3) Performs Employee's tasks".
Control returns to the Faculty constructor, which prints the string "(4) Performs Faculty's tasks".
The object creation and constructor invocation complete, and the program terminates.
*/