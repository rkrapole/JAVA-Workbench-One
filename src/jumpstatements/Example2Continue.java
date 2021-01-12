package jumpstatements;

public class Example2Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue;//skips specific step as soon as it reached the condition and continues to the next
			}
			System.out.println(i);
		}
		System.out.println("this is how 'continue' works");
	}

}
