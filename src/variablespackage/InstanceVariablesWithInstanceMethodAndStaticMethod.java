package variablespackage;

import java.util.Scanner;

public class InstanceVariablesWithInstanceMethodAndStaticMethod {

	int a, b, c;//instance variables(global)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariablesWithInstanceMethodAndStaticMethod obj = new InstanceVariablesWithInstanceMethodAndStaticMethod();
		obj.sum1();//**created this instance obj to access instance method under this  static method//

		sum2();//**created thsi calling method to access static method sub2()//
	}

	public void sum1() { //this is instance method****
		Scanner key1 = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = key1.nextInt();
		System.out.println("Enter b: ");
		b = key1.nextInt();
		c = a+b;
		System.out.println("sum result from instance method: "+c);
	}
	
	public static void sum2() {//this is static method****
		Scanner key1 = new Scanner(System.in);
		
		InstanceVariablesWithInstanceMethodAndStaticMethod obj1 = new InstanceVariablesWithInstanceMethodAndStaticMethod();
		
		System.out.println("Enter a: ");
		obj1.a = key1.nextInt();
		System.out.println("Enter b: ");
		obj1.b = key1.nextInt();
		obj1.c = obj1.a+obj1.b;
		System.out.println("sum result from static method: "+obj1.c);
	}
}
