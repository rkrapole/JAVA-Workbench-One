package loopspackage;

public class BForLoopExample2PrintingAPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 1; i <= 5; i++) { // initialization, condition, incrementation
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//Printing above pattern in reverse way
		int p, q;
		for (p = 1; p <= 5; p++) {
			for (q = 5; q >= p; q--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
