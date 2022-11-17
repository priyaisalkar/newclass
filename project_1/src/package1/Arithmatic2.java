package package1;

public class Arithmatic2        //(((((10*2)+2)-2)-2)/2)
{
int a=10;
int b=2;
public int mul(int a,int b)
{
int c=a*b;
System.out.println("mul res is"+c);
return c;
}
public int sum(int mul,int b)
{
	int d=mul+b;
	System.out.println("sum res is" +d);
	return d;
	
}
public int sub(int sum,int b)
{
	int e=sum-b;
	System.out.println("sub res is" +e);
	return e;
}
public int div(int sub,int b)
{
	int f=sub/b;
	System.out.println("div res is" +f);
	return f;
}
public static void main(String[] args)
{
	Arithmatic2 g=new Arithmatic2();
	int mulres=g.mul(10, 2);
	int sumres=g.sum(mulres,2);
	int subres=g.sub(sumres,2);
	int subres1=g.sub(subres,2);
	int divres=g.div(subres1,2);
	System.out.println("(((((10*2)+2)-2)-2)/2)");
	
	}

}
