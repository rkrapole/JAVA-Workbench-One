package variablespackage;

import java.util.Scanner;

/*Scanner class is to read different data types from keyboard using */

public class ScannerClassForInputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //read int from key board
		  int a,b,c; 
		  Scanner key1 = new Scanner(System.in);
		  
		  System.out.println("Enter value for a"); 
		  a = key1.nextInt(); // nextInt is to read int from keyboard 
		  System.out.println("Enter value for b:"); 
		  b = key1.nextInt(); 
		  c = a+b; 
		  System.out.println("c value is :"+c);
		  
		  //read string from keyboard 
		  String userName,password, finalString; 
		  //keyBoard = new Scanner(System.in);
		  
		  System.out.println("Eneter user name:"); 
		  userName=key1.nextLine(); //nextLine is to read string from keyboard
		  System.out.println("user name is :"+userName);
		  System.out.println("Eneter password:"); 
		  password=key1.nextLine();
		  System.out.println("password is :"+password);
		 
		
		//read float from keyboard
		Float p, q;
		//Scanner Key2 = new Scanner(System.in);
		
		System.out.println("x interest rate is:");
		p = key1.nextFloat(); //// nextFloat is to read float from key board
		System.out.println("y interest rate is:");
		q = key1.nextFloat();
		
		//read double from keyboard
		double l, m;
		//Scanner Key3 = new Scanner(System.in);
		
		System.out.println("l value is: ");
		l = key1.nextDouble();
		System.out.println("m value is: ");
		m = key1.nextDouble();
		
		//read long from keyboard
		long r;
		//Scanner Key4 = new Scanner(System.in);
		
		System.out.println("r long value is: ");
		r = key1.nextLong();
		
		
		
				
	}

}
