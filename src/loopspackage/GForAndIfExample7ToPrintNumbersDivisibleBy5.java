package loopspackage;

public class GForAndIfExample7ToPrintNumbersDivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers divisible by 5 are: ");
		for(int i=1;i<=100;i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}

	}

}
