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
// Outputs "Woof-Woof"



*/
