package variablespackage;

// here we have parameterized a and b into x & y and then returning sum and using in main method// 
import java.util.Scanner;

public class SumWithParametersAndScannerClass {

	static int a,b,sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyBoard= new Scanner(System.in);
		System.out.println("enter number a :");
		a=keyBoard.nextInt();
		
		System.out.println("enter number b :");
		b=keyBoard.nextInt();
		
			int sumReuslt=sum(a,b);
			System.out.println("sum of the a & b is:"+sumReuslt);
		
			
	}
	
		
	public static int sum(int x,int y) { //signature
	sum=x+y;
	return sum;
		
	}

}
