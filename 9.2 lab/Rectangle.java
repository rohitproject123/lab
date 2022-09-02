/*you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print
package lab;*/

public class Rectangle {
	private int length;
	private int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;	
	}
	void calculateArea() {
		int area=length*breadth;
		System.out.println("the area :"+area);
	}
class RectangleTest{
	public static void main(String[] args) {
		Rectangle rt = new Rectangle(20,30);
		Rectangle rt1 = new Rectangle(20,30);
		rt.calculateArea();
		rt1.calculateArea();

	}

}}
