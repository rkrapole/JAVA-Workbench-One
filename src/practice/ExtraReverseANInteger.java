package practice;

import java.util.Scanner;

public class ExtraReverseANInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actNum, reversedNum = 0;

		Scanner k = new Scanner(System.in);
		System.out.println("enter the number: ");
		actNum = k.nextInt();

		for (; actNum != 0; actNum = actNum / 10) {

			int n = actNum % 10; // 5
			reversedNum = reversedNum * 10 + n;// 0*10+5 - 5 -->123-4--> 5*10+4 - 54-->123-3 -->54*10+3 -->543
		}
		System.out.println("reversed Number is: " + reversedNum);

	}

}
