package loopspackage;

import java.util.Scanner;

public class CIfLoopsExample3AllTypesIfLadderIfNestedIf {

	public static void main(String[] args) {
		//ifexample();
		//ifelseexample();
		//ifelseifladderexample();
		//nestedifexample();
		nestedifexample1();
				
		}
	public static void ifexample() {
	//if statement tests the condition. It executes the if block if condition is true	
		int a;
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		a = key1.nextInt();
		if(a>10) {
			System.out.println("a is greater than 10");
		}
	}
	
	public static void ifelseexample() {
	//if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.	
		int a;
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		a = key1.nextInt();
		if(a>100) {
			System.out.println("a is greater than 100");
		}
		else {
			System.out.println("a is less than 100");
		}
	
	}
	
	public static void ifelseifladderexample() {
	//if-else-if ladder statement executes one condition from multiple statements.	
		int age;
		Scanner key1 = new Scanner(System.in);
		System.out.println("enter the age: ");
		age = key1.nextInt();
		
		if(age>=1 && age<23) {
			System.out.println("Intant or Student");
		}
		else if(age>=24 && age<40 ) {
			System.out.println("young man");
		}
		else if(age>=41 && age<60) {
			System.out.println("middle age man");
		}
		else if(age>=61 && age<=100 ) {
			System.out.println("old man");
		}
		else {
			System.out.println("century done, wicket ready");
		}
		
	}
	
	public static void nestedifexample() {
		//if block within another if block. inner if block condition executes only when outer if block condition is true.
		int age, weight;
		Scanner key1 = new Scanner(System.in);
		
		System.out.println("enter age: ");
		age = key1.nextInt();
		System.out.println("enter weight");
		weight = key1.nextInt();
		
		if(age>=18 && age<=45) {
			if(weight>=40 && weight<=120) {
				System.out.println("eligible to sky-dive");
			}
			else {
				System.out.println("not eligible to sky-dive");
			}
		}
	}
	public static void nestedifexample1() {
		int i;
		Scanner key1 = new Scanner(System.in);
		System.out.println("enter i value");
		i = key1.nextInt();
		
		if(i>0) {
			if(i<50) {
				if(i%2==0) {
					System.out.println(i+ " is between 1 and 50 and even number");
				}
				else {
					System.out.println(i+ " is between 1 and 50, but odd number");
				}
			}
		}
	}
	

}
