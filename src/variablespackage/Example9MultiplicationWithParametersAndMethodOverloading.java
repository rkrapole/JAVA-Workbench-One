package variablespackage;

import java.util.Scanner;

public class Example9MultiplicationWithParametersAndMethodOverloading {
	
	static int a, b, c, mul;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Enter value for a");
		a = Keyboard.nextInt();
		System.out.println("Enter value for b");
		b = Keyboard.nextInt();
		System.out.println("Enter value for c");
		c= Keyboard.nextInt();
		
		int mulResutl = mul(a,b,c);
		System.out.println("multiplication of a,b,c is: "+mulResutl);
		
		//System.out.println("multiplication of a,b,c is: "+mul(a,b,c)); //this is same as above, if we are not using it anywhere else in the program
		
		mul(a,b);
			
	}
	
	public static int mul(int x, int y, int z) { //method signature - parameterization
		mul = x*y*z;
		return mul;
	}
	
	public static void mul(int x, int y) {//method with the same name but different signature, different parameters -> Method Overloading.
		mul = x*y;
		System.out.println("multiplication of two numbers: "+mul);
	}

}
