class MyClass {
  public static void main(String[ ] args) {
    System.out.println("Hello World");
  }
}
//- public: anyone can access it
//- static: method can be run without creating an instance of the class containing the main method
//- void: method doesn't return any value
//- main: the name of the method


/* Variables
Variables have types. Some examples:
- int: for integers (whole numbers) such as 123 and -456
- double: for floating-point or real numbers with optional decimal points and fractional parts in fixed or scientific notations, such as 3.1416, -55.66.
- String: for texts such as "Hello" or "Good Morning!". Text strings are enclosed within double quotes. 

Getting User Input

While Java provides many different methods for getting user input, the Scanner object is the most common, and perhaps the easiest to implement. Import the Scanner class to use the Scanner object, as seen here:
import java.util.Scanner; 

In order to use the Scanner class, create an instance of the class by using the following syntax:
Scanner myVar = new Scanner(System.in);

You can now read in different kinds of input data that the user enters. 
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()
import java.util.Scanner;

class MyClass {
  public static void main(String[ ] args) {
    Scanner myVar = new Scanner(System.in);
    System.out.println(myVar.nextLine());        
  }
}


Arrays
int[ ] arr = new int[5];
arr[2] = 42;
String[ ] myNames = { "A", "B", "C", "D"};
System.out.println(myNames[2]);
int[ ] intArr = new int[5];
System.out.println(intArr.length);
int[ ] primes = {2, 3, 5, 7};

for (int t: primes) {
   System.out.println(t); 
}

/*
2
3
5
7
*/

class MyClass {
  public static void main(String[ ] args) {
    Animal dog = new Animal();
    dog.bark();
  }
}

//****************************Getters & Setters

public class Vehicle {
  private String color;

  // Getter
  public String getColor() {
    return color;
  }

 // Setter
  public void setColor(String c) {
    this.color = c;
  }
}

public static void main(String[ ] args) {
  Vehicle v1 = new Vehicle();
  v1.setColor("Red");
  System.out.println(v1.getColor());
}


//****************************Example of a constructor:
public class Vehicle {
  private String color;
  Vehicle() {
     color = "Red";
  }
}
///Using Constructors
public class MyClass {
  public static void main(String[ ] args) {
    Vehicle v = new Vehicle("Blue");
  }
}
//Constructors

public class Vehicle {
  private String color;

  Vehicle() {
    this.setColor("Red");
  }
  Vehicle(String c) {
    this.setColor(c);
  }

  // Setter
  public void setColor(String c) {
    this.color = c;
  }
}

/*****************************************MATH******************************************/
int a = Math.abs(10);  // 10
int b = Math.abs(-20); // 20

double c = Math.ceil(7.342);  // 8.0

double f = Math.floor(7.343);  // 7.0

int m = Math.max(10, 20);  // 20

int m = Math.min(10, 20);  // 10

double p = Math.pow(2, 3); // 8.0

/****************************************Inheritance***********************************/
//EXAMPLE 1
class Animal {
  protected int legs;
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog extends Animal {
  Dog() {
    legs = 4;
  }
}
//EXAMPLE 2
class A {
  public A() {
    System.out.println("New A");
  }
}
class B extends A {
  public B() {
    System.out.println("New B");
  }
}

class Program {
  public static void main(String[ ] args) {
      B obj = new B();
  }
}
/*Outputs
"New A"
"New B"
*/
/************ abstract class **************************************************************

/* An abstract class is defined using the abstract keyword.
- If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
- To use an abstract class, you have to inherit it from another class.
- Any class that contains an abstract method should be defined as abstract. */

  abstract class Animal {
  int legs = 0;
  abstract void makeSound();
}
class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}
/*************   interface ******************************************************************************************
An interface is a completely abstract class that contains only abstract methods.
Some specifications for interfaces:
- Defined using the interface keyword.
- May contain only static final variables.
- Cannot contain a constructor because interfaces cannot be instantiated.
- Interfaces can extend other interfaces.
- A class can implement any number of interfaces. */

interface Animal {
  public void eat();
  public void makeSound();
}

class Cat implements Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
  public void eat() {
    System.out.println("omnomnom");
  }
}
/*************   Type Casting ****************************************************************************/
int a = (int) 3.14;
System.out.println(a);
//Outputs 3

//Upcasting
Animal a = new Cat();
//Downcasting
Animal a = new Cat();
((Cat)a).makeSound();
/*************   Anonymous Classes ****************************************************************************/

class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

public static void main(String[ ] args) {
  Machine m = new Machine() {
    @Override public void start() {
      System.out.println("Wooooo");
    }
  };
  m.start();
}
//Outputs "Wooooo";


// Example 2
class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}  
public static void main(String[ ] args) {
  Machine m1 = new Machine() {
    @Override public void start() {
      System.out.println("Wooooo");
    }
  };
  Machine m2 = new Machine();
  m2.start();
  }
//Outputs "Starting..."

/*************   Inner Classes ****************************************************************************/

class Robot {
  int id;
  Robot(int i) {
    id = i;
    Brain b = new Brain();
    b.think();
  }

  private class Brain {
    public void think() {
      System.out.println(id + " is thinking");
    }
  }

}
/*************   Comparing Objects ****************************************************************************/

class Animal {
  String name;
  Animal(String n) {
    name = n;
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Animal a1 = new Animal("Robby");
    Animal a2 = new Animal("Robby");
    System.out.println(a1 == a2);
  }
}
//Outputs false

/*************   equals() ***************************************************************************


Each object has a predefined equals() method that is used for semantical equality testing.
But, to make it work for our classes, we need to override it and check the conditions we need.
There is a simple and fast way of generating the equals() method, other than writing it manually.
Just right click in your class, go to Source->Generate hashCode() and equals()...


This will automatically create the necessary methods.*/
class Animal {
  String name;
  Animal(String n) {
    name = n;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Animal other = (Animal) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}

public static void main(String[ ] args) {
  Animal a1 = new Animal("Robby");
  Animal a2 = new Animal("Robby");
  System.out.println(a1.equals(a2));
}
//Outputs true

/*************   Enums ***************************************************************************/

enum Rank {
  SOLDIER,
  SERGEANT,
  CAPTAIN
}
Rank a = Rank.SOLDIER;

/*************   Java API **************************************************************************
The Java API is a collection of classes and interfaces that have been written for you to use.
The Java API Documentation with all of the available APIs can be located on the Oracle website at 
http://docs.oracle.com/javase/7/docs/api/
Once you locate the package you want to use, you need to import it into your code.
The package can be imported using the import keyword.
For example:
import java.awt.*;

The awt package contains all of the classes for creating user interfaces and for painting graphics and images.
The wildcard character (*) is used to import all of the classes in the package.
*/
/*************   Exception Handling **************************************************************************/
public class MyClass {
  public static void main(String[ ] args) {
    try {
      int a[ ] = new int[2];
      System.out.println(a[5]);
    } catch (Exception e) {
      System.out.println("An error occurred");
    }
  }
}
//Outputs "An error occurred"
//********************************************throw
int div(int a, int b) throws ArithmeticException {
  if(b == 0) {
    throw new ArithmeticException("Division by Zero");
  } else {
    return a / b;
  }
}

/*****************************************Exception Handling*/

try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
}
/*************   Threads **************************************************************************/

class Loader extends Thread {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Loader obj = new Loader();
    obj.start();
  }
}
/*
The other way of creating Threads is implementing the Runnable interface.
Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.


Example:
*/
class Loader implements Runnable {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Thread t = new Thread(new Loader());
    t.start();
  }
}

/*************   Types of Exceptions **************************************************************************/
public class MyClass {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //some code
    }
  }
}
/*************   ArrayList **************************************************************************/
import java.util.ArrayList;
//...
ArrayList colors = new ArrayList();

ArrayList<String> colors = new ArrayList<String>(10);

//Example 2

import java.util.ArrayList;

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.remove("Green");

    System.out.println(colors);
  }
}
// Output: [Red, Blue, Orange]

/*************   LinkedList **************************************************************************/

import java.util.LinkedList;

public class MyClass {
  public static void main(String[ ] args) {
    LinkedList<String> c = new LinkedList<String>();
    c.add("Red");
    c.add("Blue");
    c.add("Green");
    c.add("Orange");
    c.remove("Green");
    System.out.println(c);
  }
}
// Outputs [Red, Blue, Orange]

/******************* LinkedList vs. ArrayList ********************************/

/* The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.


You can use the enhanced for loop to iterate over its elements. */

LinkedList<String> c = new LinkedList<String>();
c.add("Red");
c.add("Blue");
c.add("Green");
c.add("Orange");
c.remove("Green");

for(String s: c) {
  System.out.println(s);
}
/* Output:
Red
Blue
Orange
 */

/******************* HashMap ********************************/

/*
Arrays and Lists store elements as ordered collections, with each element given an integer index.
HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). 
The put, remove, and get methods are used to add, delete, and access values in the HashMap.

Example:
*/
import java.util.HashMap;
public class MyClass {
  public static void main(String[ ] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Amy", 154);
    points.put("Dave", 42);
    points.put("Rob", 733);
    System.out.println(points.get("Dave")); 
  }
}
// Outputs 42
/******************* HashSet ********************************/

/*
A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
One of the implementations of the Set is the HashSet class.

Example:
*/

import java.util.HashSet;

public class MyClass {
  public static void main(String[ ] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("A");
    set.add("B");
    set.add("C");
    System.out.println(set);
  }
}
//  Output: [A, B, C]

/*
LinkedHashSet

The HashSet class does not automatically retain the order of the elements as they're added. 
To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in 
the order in which they were inserted.
*/


/******************* Sorting Lists **************************************************************************/

/*
For the manipulation of data in different collection types, the Java API provides a Collections class, which is included in the java.util package. 
One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. The methods in the Collections class are static, 
so you don't need a Collections object to call them.
Example:
*/

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("tiger");
    animals.add("cat");
    animals.add("snake");
    animals.add("dog");
       
    Collections.sort(animals);
       
    System.out.println(animals);
  }
}
/* Outputs:
[cat, dog, snake, tiger]
*/


/******************* Iterators **************************************************************************/
/*
An Iterator is an object that enables to cycle through a collection, obtain or remove elements. 
Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. By using this iterator object, you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:
hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
next(): Returns the next object and advances the iterator.
remove(): Removes the last object that was returned by next from the collection.

The Iterator class must be imported from the java.util package.

Example:
*/

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
   public static void main(String[ ] args) {
  LinkedList<String> animals = new LinkedList<String>();
  animals.add("fox");
  animals.add("cat");
  animals.add("dog");
  animals.add("rabbit");

  Iterator<String> it = animals.iterator();
  String value = it.next();
  System.out.println(value);
}
}
//Outputs "fox"

//*******************************************Interators loop

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
  public static void main(String[ ] args) {
    LinkedList<String> animals = new LinkedList<String>();
    animals.add("fox");
    animals.add("cat");
    animals.add("dog");
    animals.add("rabbit");
     
    Iterator<String> it = animals.iterator();
    while(it.hasNext()) {
      String value = it.next();
      System.out.println(value);   
     }
  }
}
/*
fox
cat
dog
rabbit
*/


/******************* Working with Files **************************************************************************/

import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\sololearn\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}

//////////////Reading a File

try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {

}
/*
The Scanner class inherits from the Iterator, so it behaves like one.
We can use the Scanner object's next() method to read the file's contents.
*/
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}

///////////////Creating Files
import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\sololearn\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}



















