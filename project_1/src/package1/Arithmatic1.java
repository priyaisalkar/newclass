package package1;

public class Arithmatic1       // (((((10+2)+2)-2)*2)/2)
{
	int i=10;
	int j=2;
	public int sum(int i,int j)
	{
		int k=i+j;
		System.out.println("sum result is" +k);
		return k;
		
	}
	public int sub(int sum,int j)
	{
		int l=sum-j;
		System.out.println("sub result is" +l);
		return l;
	}
	public int mul(int sub,int j)
	{
		int m=sub*j;
		System.out.println("mul result is" +m);
		return m;
	}
	public int div(int mul,int j) 
	{
	int n= mul / j;
	System.out.println("div result is" +n);
	return n;
	}
	public static void main(String[] args)
	{
		Arithmatic1 p=new Arithmatic1();
		int result1=p.sum(10,2);
		int result2=p.sum(result1,2);
		int result3=p.sub(result2,2);
		int result4=p.mul(result3,2);
		int result5=p.div(result4,2);
		System.out.println("(((((10+20)+2)-2)*2)/2)=" + result5 );
		
	}
	
	
	
	
	

}
