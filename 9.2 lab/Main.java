package lab;
/*you are given a class AdvancedArithmetic which contains a methods signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the 
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For 
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at 
most 1000.
Read the partially completed code in the editor and complete it. You just need to write the 
MyCalculator class only. Your class shouldn't be public.*/

import java.io.*;
import java.util.*;

class AdvancedArithmetic{
public int divisorSum(int n){
    int sum=1;
    for(int i=2;i<=(n/2);i++){
        if(n%i==0)sum+=i;
    }
    if(n!=1)return sum+n;
    else return sum;
}
}

public class Main{

    public static void main(String[] args) {
    	System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new AdvancedArithmetic(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("The output is "+sum);
    }
}







