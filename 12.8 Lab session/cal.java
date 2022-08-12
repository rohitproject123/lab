/*Q.5
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24*/ 


class cal{
 
 public static void main(String[] args) {
  
   
  System.out.println("The first number is " +125);
  int num1 = 125;
   
  System.out.println("The second number is "+24);
  int num2 = 24;
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 }
 
}