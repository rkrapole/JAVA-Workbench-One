package jumpstatements;

public class Example1Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;//breaks as soon as it reached the condition and comes out of the loop(main loop)
			}
			System.out.println(i);
		}
		System.out.println("this is how 'break' works");
	}

}
