package exceptions;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ramakrishna";
		
		try {
			char c = name.charAt(11);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("executing from StringIndexOutOfBoundsException catch: ");
			System.out.println(e);
		}
		

	}

}
