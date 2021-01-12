package practice;

public class PrintPatternNumbers {

	public static void main(String[] args) {
		int r, c;
		for (r = 5; r >= 1; r--) {
			for (c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		int i, j;
		for (i = 2; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}