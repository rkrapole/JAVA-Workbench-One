package variablespackage;

/*-> this is example for 'Static Variables'<- variables should be declared with 'static' 
keyword and can be accessed anywhere or in any method, without creating an object/instance*/

public class Example3StaticVariablesExample {

	static int a = 3, b = 4, c, d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = a+b;
		System.out.println(c);

	}

}
