/*Class A serves as a base class for the derived class B, which in turn 
serves as a base class for the derived class C. (Which type Of Inheritance 
explain with an example*/
package lab;
import java.util.*;
class one {
    public void print_geek()
    {
        System.out.println("God");
    }}
class two extends one {

    public void print_for() { System.out.println("Rohit"); }
}
class three extends two {
    public void print_geek()
    {
        System.out.println("God");}}
public class Main2 {
    public static void main(String[] args)
    {

        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();}}
//this is a Type of Multilevel Inheritance.