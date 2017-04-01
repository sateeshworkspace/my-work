
public class Example 
{
	/*
	public int abs(int a)
	{
	    System.out.println("Integer Version Method:");
		return a<0?a*-1:a;
	}
	*/
	public long abs(long a)
	{
		 System.out.println("Long Version Method:");
		 return a<0?a*-1:a;
	}
	/*
	public float abs(float a)
	{
		System.out.println("Float Version Method:");
		return a<0?a*-1:a;
	}
	*/
	public double abs(double a)
	{
		System.out.println("Double Version Method:");
		return a<0?a*-1:a;
	}
	public static void main(String args[])
	{
		Example ex=new Example();
		System.out.println(ex.abs(-10));
		System.out.println(ex.abs(-10l));
		System.out.println(ex.abs(-10f));
		System.out.println(ex.abs(-10d));
		
	}

}
