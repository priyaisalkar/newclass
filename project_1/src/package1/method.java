package package1;

public class method 
{
public void m1()
{
this.m4(5,6,7);	
System.out.println("default method");
this.m5(2,6,4,8);
this.m2(9);
this.m3(5,7);
}
public void m2(int a)
{
	System.out.println("one parametrized method");
}
public void m3(int a,int b)
{
	System.out.println("two parametrized method");
}
public void m4(int a,int b,int c)
{
	System.out.println("three parametrized method");
}

public void m5(int a,int b,int c,int d)
{
	System.out.println("four parametrized method");
}
public static void main(String[] args)
{
	method obj=new method();
	obj.m1();
}
}
