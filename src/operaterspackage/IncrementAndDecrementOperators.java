package operaterspackage;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x = 1; x = ++x; System.out.println(x);
		 */
		
		int l = 5;
		System.out.println(l++);
		System.out.println("l value is :"+l);
		System.out.println(++l);
		System.out.println("l value is :"+l);
		System.out.println(l--);
		System.out.println("l value is :"+l);
		System.out.println(--l);
		System.out.println("l value is :"+l);
		System.out.println(l++ - --l);
		System.out.println("l value is :"+l);

	}

}
