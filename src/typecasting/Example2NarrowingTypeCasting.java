package typecasting;
//converting (or) assigning value of larger size type to smaller size type
public class Example2NarrowingTypeCasting {

	public static void main(String[] args) {
		//double-->float-->long-->int-->short-->byte
		int n = 12;
		System.out.println("integer n is: "+n);
		double d = n;//assigning smaller type(int) value to larger size type(double) --> AUTOMATIC
		System.out.println("double d is: "+d);
		
		int k = (int) d;
		System.out.println("double to int --> integer k is: "+k);//assigning larger to smaller size --> MANUAL
		
		float t = 4.5f;
		int q = (int) t;
		System.out.println("float to int --> integer q is: "+q);
		
		double h = 345d;
		float j = (float) h;
		System.out.println("double to float --> float h is: "+j);
		
		long l = (long) h;
		System.out.println("double to long --> long l is: "+l);
		
		short s = (short) h;
		System.out.println("double to short --> short s is: "+s);
		
		byte b = (byte) h;
		System.out.println("double to byte --> byte b is: "+b);
		
		double d1 = 4.56723234234324d;
		float f1 = (float) d1;
		System.out.println("double to float --> float f1 is: "+f1);
		
		long l11 = 987654321;
		int i11 = (int) l11;
		System.out.println("long to int --> int i11 is: "+i11);
		short s11 = (short) l11;
		System.out.println("long to shot --> short i11 is: "+s11);
		byte b11 = (byte) l11;
		System.out.println("long to byte --> byte b11 is: "+b11);
	

		 
	}

}
