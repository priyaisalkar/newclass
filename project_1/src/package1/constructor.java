package package1;

public class constructor 
{
public constructor()
{
	this(2,4,16,28);
	System.out.println("default constructor");
}
public constructor(int a)
{
	this();
	System.out.println("one parametrized constructor");
	
}

public constructor(int a, int b)
{
	this(2,6,9);
	System.out.println("two parametrized constructor");
	
}

public constructor(int a, int b, int c)
{
	this(1);
	System.out.println("three parametrized constructor");
	
}

public constructor(int a, int b ,int c,int d)
{
	System.out.println("four parametrized constructor");
	
}
public static void main(String[] args)
{
	constructor obj=new constructor(5,6);

}
}
