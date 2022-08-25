//write a java program to find the factorial of a number

import java.util.*;
public class FindFactorial {
  public static void main(String[] args) {
	  System.out.println("Enter an Number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    if(num < 0){
        System.out.println("Factorial of negative numbers cannot be calculated.");
    } else if(num == 0){
        System.out.println("Factorial of 0 is 1.");
    }
    else{
        long factorial = 1;
    
        for(int i=num; i>1 ; i--){
            factorial *= i;
        }
    
        System.out.println("Factorial of "+num+" is "+factorial);
    }
    

  }
}
	
