/*In this example, you have a base class Teacher and a sub class ITTeacher. Since 
class ITTeacher extends the designation and college properties and work () method from 
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the 
teachers so we have declared them in the base class, this way the child classes like Math 
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used 
directly from base class.*/
package lab;

class Teacher {
	   String designation = "Teacher";
	   String collegeName = "Anudip";
	   void does(){
	System.out.println("Teaching");
	   }
	}

	public class PhysicTeacher extends Teacher{
	   String mainSubject = "Physics";
	   public static void main(String args[]){
	PhysicTeacher obj = new PhysicTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
	   }
	}
