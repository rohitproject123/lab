/*Q.2
Java: Swapping two variables
Swapping two variables refers to mutually exchanging the values of the
variables. Generally, this is done with the data in memory.*/



class swap{
 
 public static void main(String[] args) {
     
   int a, b, temp;
   a = 15;
   b = 27;
   System.out.println("a & b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping a & b = "+a+", "+ + b);
 }
 }