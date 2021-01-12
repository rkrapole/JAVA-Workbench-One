package practice;

import java.util.Scanner;

public class PolindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("enter the string: ");
		String actualString = key.nextLine();
		String reversedString = "";
		
		char[] actualStrArray = actualString.toCharArray();
		
		for (int i = actualStrArray.length-1; i >= 0; i--) {
			reversedString = reversedString+actualStrArray[i];
		}
		if(actualString.equals(reversedString)) {
			System.out.println("given string is a Polindrome");
		}
		else {
			System.out.println("given string is not a Polindrome");
		}
	}
}
