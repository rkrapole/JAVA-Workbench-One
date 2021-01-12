package practice;

import java.util.Scanner;

public class FindingAreaOfCircle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d, r, pi=3.14f;
		Scanner key = new Scanner(System.in);
		System.out.println("enter diameter of the Circle: ");
		d = key.nextFloat();
		
		r=d/2;
		System.out.println("radius of the Circle is: "+r);
		
		area(r,pi);
		
	}

	private static void area(float a, float b) {
		//float pi =3.14f;
		float area  = (float) (b*(a*a));
		System.out.println("AREA of the Circle is = "+area);
		
	}

}
