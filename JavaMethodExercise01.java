//Import the scanner class
import java.util.Scanner;

//defining a public class
public class Converter{

//defining the main method 
 public static void main(String [] args){
	 //Instantiate an object of type scanner, with a reference variable named scanner
	 Scanner scanner =new Scanner(System.in);
	 //Asking to the user for enter an input
	 System.out.println("Enter the first value:");
	 //Storing the entered value inside a double variable.
	 double enterValue=scanner.nextDouble();
	
	 //Output the call to the celsius method and pass to it the entered value from the user
     //like an argument.	 
	 System.out.println(celsius(enterValue));
	 
	 
	 
 }
 
 //Defining a static method, this method do the maths for convert the the Fahrenheit to celsius.
 public static double celsius(double enterValue){
	 System.out.print("The value is =");
	  return (enterValue-32)*5/9;
	 
 }
 
}
