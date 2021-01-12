package practice;

public class IncrementAndDecrementOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 3, c = 3;
		
		int mulPostIncr = a * b++;//print & then compute
		System.out.println("multiplication using POST increment is--> "+mulPostIncr);
		int mulPreIncr = a * ++b;//compute & then print.b value is already 4 from line9, and this pre-increment would set it to 5
		System.out.println("multiplication using PRE increment after is--> "+mulPreIncr);
		int mulPreIncr1 = a * ++c;
		System.out.println("multiplication using fresh PRE increment is--> "+mulPreIncr1);
		
		
		int x = 5, y = 3, z =3;
		int mulPostDecr = x * y--;
		System.out.println("multiplication using POST decrement is --> "+mulPostDecr);
		int mulPreDecr = a * --z;
		System.out.println("multiplication using PRE decrement is --> "+mulPreDecr);
		int mulPreDecr1 = a * --z;
		System.out.println("multiplication using fresh PRE decrement is --> "+mulPreDecr1);
		
		int p = 7;
		int q = ++p + p++;
		System.out.println("q Value is --> "+q);//should be 16
		
		int l = 6;
		int m = l-- + --l;
		System.out.println("m value is -->"+m);//should be 10
		
		int u = 4, v = 5;
		int result = ++u * v++ + u++ - --v + u/2;
		System.out.println("result value is: "+result);//should be 28
		

	}

}
