package practice;

import java.util.Scanner;

public class ExtraFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, n1 = 0, n2 = 1, n3;

		Scanner k = new Scanner(System.in);
		System.out.println("enter the number: ");
		number = k.nextInt();

		System.out.print(n1 + " " + n2);

		for (int i = 1; i <= number - 2; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
