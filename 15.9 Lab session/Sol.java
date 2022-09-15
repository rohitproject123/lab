package lab;
/*1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic*/
import java.util.*;
class Arithmetic{
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic{ 
    public int callAdd(int a, int b){
        return add(a, b);
    }
}

public class Sol{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My Superclass is: " + a.getClass().getSuperclass().getName()); 
        System.out.println(a.add(20,30) + a.add(20,2) + a.add(15,17));
     }
}
