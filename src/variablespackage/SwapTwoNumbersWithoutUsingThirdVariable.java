package variablespackage;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 8, b = 16;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("New value of a is: "+a);
		System.out.println("New value of b is "+b);

	}

}
