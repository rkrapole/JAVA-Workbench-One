package practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1, n3, num;// 0 & 1 we declare
		Scanner key = new Scanner(System.in);
		System.out.println("enter the number for fibonacci series: ");
		num = key.nextInt();
		
		System.out.print(n1+" "+n2);// printing first two numbers
		for(int i=1;i<=num-2;i++) {//since we already declared first two numbers, i<=num-2
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
