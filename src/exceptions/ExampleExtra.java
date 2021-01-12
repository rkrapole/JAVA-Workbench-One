package exceptions;


public class ExampleExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15;
		try {
			System.out.println("1st statement: " + a / 0);
		} catch (ArithmeticException e) {
			System.out.println("from ArithmeticException Catch block: ");
			System.out.println(e);
		}

		try {
			int[] ar1 = { 1, 2, 3 };
			System.out.println("2nd statement: " + ar1[2]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("from ArrayIndexOutOfBoundsException Catch block: ");
			System.out.println(e); // TODO: handle exception }

		}
			String st1 = null;
			System.out.println("3rd statement: " + st1.charAt(3));

		

	}
}
