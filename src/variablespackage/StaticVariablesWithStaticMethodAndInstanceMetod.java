package variablespackage;

import java.util.Scanner;

public class StaticVariablesWithStaticMethodAndInstanceMetod {
	
	static int a,b,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariablesWithStaticMethodAndInstanceMetod obj = new StaticVariablesWithStaticMethodAndInstanceMetod();
		sum1();
		obj.sum2();
	}
	public static void sum1() {//Static metod
		Scanner key1 = new Scanner(System.in);
		
		System.out.println("Enter value for a: ");
		a = key1.nextInt();
		System.out.println("Enter value for b: ");
		b = key1.nextInt();
		c = a+b;
		System.out.println("Sum of Static method is: "+c);
	}
	public void sum2() {/*Instance method. you don't need to create an obj under this method to access the global variables,  
						since we already used key word Static, so there variables can be access anywere across the class*/
		Scanner key2 = new Scanner(System.in);
		
		System.out.println("Enter value for a: ");
		a = key2.nextInt();
		System.out.println("Enter value for b: ");
		b = key2.nextInt();
		c = a+b;
		System.out.println("Sum of Instance method is: "+c);
	}
}


