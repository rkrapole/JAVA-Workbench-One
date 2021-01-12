package loopspackage;
import java.util.Scanner;

public class KIfElseAndSwitchDifferencesExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//float type can be evaluated using if-else//	
	float interestRate;
	Scanner key = new Scanner(System.in);
	System.out.println("enter bank rate of interest: ");
	interestRate = key.nextFloat();
	
	if (interestRate <= 6.5) {
		System.out.println("ready to take loan");
	}
	else {
		System.out.println("not ready to take loan");
	}
	
	//checking whether float type can be evaluated using witch - we cannot//
		/*
		 * System.out.println("enter bank rate of interest: "); float interestRate1;
		 * interestRate1 = key.nextFloat();
		 * 
		 * switch (interestRate1) { case 6.5f:
		 */
		
	
	}
	
	

}
