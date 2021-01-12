package practice;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int temp, q, qSum = 0;

		Scanner k = new Scanner(System.in);
		System.out.println("enter the number to check: ");
		int num = k.nextInt();

		temp = num;

		for (; num != 0; num = num / 10) {

			// System.out.println("num is: " +num);
			q = num % 10;
			// System.out.println("q is: " +q);
			qSum = qSum + (q * q * q);
			// System.out.println("qubesum is: "+qSum);
		}
		if (temp == qSum) {
			System.out.println(temp + " is a Armstrong Number");
		} else {
			System.out.println(temp + " is not a Armstrong Number");
		}

	}

}
