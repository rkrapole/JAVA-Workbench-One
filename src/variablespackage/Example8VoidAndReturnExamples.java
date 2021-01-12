package variablespackage;

import java.util.Scanner;

public class Example8VoidAndReturnExamples {

	static int a, b, c, sumreturnresult;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.println("enter a");
		a = key.nextInt();
		System.out.println("enter b");
		b = key.nextInt();
		sum(a, b);
		sum1(a,b);

		sumreturnresult = sumreturn(a, b);
		System.out.println("result of sumreturn: " + sumreturnresult);

	}

	public static void sum(int x, int y) {
		int sum = x + y;
		System.out.println("result of sum: " + sum);

	}

	public static void sum1(int p, int q) {
		Scanner key = new Scanner(System.in);
		System.out.println("enter a");
		a = key.nextInt();
		System.out.println("enter b");
		b = key.nextInt();

		c = a + b;
		System.out.println("result of sum1: " + c);
	}

	public static int sumreturn(int x, int y) {

		int sumreturn = x + y;
		return sumreturn;
	}

}
