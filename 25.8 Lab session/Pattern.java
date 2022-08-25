//Write a java Program to draw a Pattern

import java.util.*;
public class Pattern {
 public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int N=input.nextInt();
        for(int i=1; i<=N; i++)
        {
            for(int j=0; j<N-i; j++)
                System.out.print(" ");
            for(int j=0; j<(2*i-1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}