package practice;

import java.util.Scanner;

public class FactorialExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, fact = 1;
		Scanner key = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		n = key.nextInt();
		
		for (i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial value of "+n+" is: "+fact);
		

	}

}
