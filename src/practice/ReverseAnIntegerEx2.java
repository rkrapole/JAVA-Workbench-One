package practice;

import java.util.Scanner;

public class ReverseAnIntegerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualNum = 12345, reversedNum = 0;
		Scanner k = new Scanner(System.in);
		
		for (; actualNum != 0; actualNum = actualNum / 10) { // condition & operation
			
			System.out.println("actual number" +actualNum);
			int n = actualNum % 10;
			System.out.println("n is" +n);
			reversedNum = reversedNum * 10 + n;
			System.out.println("reversed number" +reversedNum);
		}

		System.out.println("reversed number is: " + reversedNum);

	}

}
