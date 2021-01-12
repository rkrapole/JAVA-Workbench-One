package practice;

import java.util.Scanner;

public class PrimeNumberExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0;
		 Scanner key = new Scanner(System.in);
		 System.out.println("enter the number: ");
		 num = key.nextInt();
		 
		 for (int i = 1;i<=num; i++) { ///arrays will start with 0 index
			 
			 if (num % i == 0) {
				 count++;
			 }
			
		}
		 if (count == 2) {
			 System.out.println(+num+ " is Prime numer");
		 }
		 else {
			 System.out.println(+num+ " is not a Prime number");
		 }

	}

}
