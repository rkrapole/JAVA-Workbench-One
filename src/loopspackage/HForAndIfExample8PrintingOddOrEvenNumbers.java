package loopspackage;

public class HForAndIfExample8PrintingOddOrEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Below are Odd Numbers between 1 to 100: ");
		for(int i=1;i<=100;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Below are Even Numbers between 1 to 100: ");
		for(int j=1;j<=100;j++ ) {
			if(j % 2 == 0 ) {
				System.out.println(j);
			}
		}

	}

}
