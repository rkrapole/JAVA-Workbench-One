package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int[] ar1 = new int[5];

		try { // try block holds actual code
			System.out.println(a / 2);
			System.out.println("accessing 8th element in array: " + ar1[7]);

		} catch (ArithmeticException e) { // holds possible exception
			System.out.println("I'm executing from ArithmeticException catch");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I'm executing from ArrayIndexOutOfBoundsException catch");
			System.out.println(e);
		}

		try { //if we specify separate try it works independently even if previous try throws some exception
			File file = new File("C:\\Automation\\abc.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("file doesn't exist ");
			System.out.println(e);
		}
		

		finally { // it executes regardless of the error/no-error from catch block
			System.out.println("I'm in final block");
		}

	}

}
