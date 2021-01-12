package variablespackage;

//This code has just a main method with sub methods as void. so nothing gets returned//

public class Example5ClassWithMainAndSubMethodsVoidNoReturn {

	static int a = 5, b = 2, c, d, e;
	
	public static void main(String[] args) 	{
		sum ();//calling method
		sub ();//calling method
		e = c*d;
		System.out.println(e);
	}
	
	public static void sum() 	{
		c = a+b;
		System.out.println(c);
	}
	public static void sub() 	{
		d = a-b;
		System.out.println(d);
	}
	
	
}
