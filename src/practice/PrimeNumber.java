package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		Scanner k = new Scanner(System.in);
		System.out.println("enter n: ");
		n = k.nextInt();
		
		//boolean isPrime = true;
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				count++;
				System.out.println("Count value is:"+count);
				System.out.println("i value is:"+i);
				System.out.println("n value is:"+n);
				
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
		

	}

}
