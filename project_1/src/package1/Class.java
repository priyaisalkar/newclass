package package1;

public class Class 
{
	int age;
	int roll_no;
	public void display()
	{
		System.out.println("Welcome to all of you");
		
	}
public void display1()
   {
	System.out.println("Automation is easy");
	}
public static void main(String[] args)
{
	Class priya=new Class();
	priya.display();
	priya.display1();
	priya.age=27;
	priya.roll_no=10;
	System.out.println("age is" + priya.age);
	System.out.println("roll_no is" + priya.roll_no);
	}
}
