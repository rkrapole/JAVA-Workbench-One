package typecasting;
//converting (or) assigning value of smaller size type to larger size type
public class Example1WideningTypeCasting {

	public static void main(String[] args) {
		//byte-->short-->int-->long-->float-->double
		int n = 12;
		double d = n;//assigning smaller type(int) value to larger size type(double)
		System.out.println("int to double --> double d is: "+d);
		
		short s = 5;
		int m = s;
		System.out.println("short to int --> int m is: "+m);
		float f = m;
		System.out.println("int to float --> float f is: "+f);
		double d1 = m;
		System.out.println("int to double --> float d1 is: "+d1);
		long l1 = m;
		System.out.println("int to long --> long l1 is: "+l1);
		
		float r = 39.45f;
		double k = r;
		System.out.println("float to double --> double k is: "+k);
		
		long w = 3456789l;
		float x = w;
		System.out.println("long to float --> float x is: "+x);
		double y = w;
		System.out.println("long to double --> double y is: "+y);
		
		byte b = 12;
		long l = b;
		System.out.println("byte to long --> long l is: "+l);
		
			

	}

}
