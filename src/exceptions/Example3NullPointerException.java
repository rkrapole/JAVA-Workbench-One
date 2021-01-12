package exceptions;

public class Example3NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = null;
		
		
		try {
			System.out.println(s1.charAt(0));
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("executing from NullPointerException catch block");
			System.out.println(e);
		}
		
		

	}

}
