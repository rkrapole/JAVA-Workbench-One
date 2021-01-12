package practice;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualString;
		
		Scanner key = new Scanner(System.in);
		System.out.println("enter actual sting: ");
		actualString = key.nextLine();
		
		String[] letters = actualString.split("");
		
		
		for(int i = letters.length-1;i>=0;i--) {
			
			System.out.print(letters[i]);
			
			}
		

	
	
	}

}
