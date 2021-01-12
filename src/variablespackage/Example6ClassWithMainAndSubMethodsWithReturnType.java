package variablespackage;

public class Example6ClassWithMainAndSubMethodsWithReturnType {

	static int a = 5, b = 3, sum,sub,mul;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sum1Result, sub1Result, mul1Result, sum2Result, sub2Result, mul2Result;
		
		
	sum1Result=sum1();
	System.out.println(sum1Result);
	
	sub1Result=sub1();
	System.out.println(sub1Result);
	
	mul1Result=sum1Result*sub1Result;
	System.out.println(mul1Result);
	
	Example6ClassWithMainAndSubMethodsWithReturnType obj1 = new Example6ClassWithMainAndSubMethodsWithReturnType();//here we are accessing non-static method (sum2,sub2) under this static main method//
	sum2Result = obj1.sum2();
	System.out.println(sum2Result);
	sub2Result = obj1.sub2();
	System.out.println(sub2Result);
	mul2Result = sum2Result*sub2Result;
	System.out.println(mul2Result);
		
	}

	public static int sum1() { //this static method is having return type so, method should have data type, here it is int//
		sum = a+b;
		//System.out.println(c);
		return sum;
	}
	public static int sub1() {
		sub = a-b;
		return sub;
	}
	
	public int sum2() { // this is non static method
		sum = a+b;
		return sum;
	}
	public int sub2() {
		sub = a-b;
		return sub;
	}
		
}
	
	
	
	
	
	

