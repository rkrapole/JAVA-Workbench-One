package loopspackage;

public class JIterativeLoopsExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("/////////For loop output///////////////");
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}
		System.out.println("/////////while loop output///////////////");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("/////////do-while loop output///////////////");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j >= 10);// use ;colon since it is last statement

		System.out.println("/////////for-each loop output///////////////");
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : array1) { // for each - advance --> will be used only for array, array list, collections
			System.out.println(num);
		}
		
		String[] students = { "vijay", "ajay", "ram", "sid", "raj" };
		int studentsSize = students.length;
		System.out.println("students - for o/p--> ");
		for (int k = 0; k < students.length; k++) {// ****for string it should be always initialized with zero and condition should is always < less than
			System.out.println(students[k]);
		}
		System.out.println("students - for-each o/p--> ");
		for (String student : students) { // for each
			System.out.println(student);
		}
		String[] fruits = { "apple", "banana", "grape", "berry" };
		System.out.println("fruits - for-each o/p--> ");
		for (String fruit : fruits) { // for each
			System.out.println(fruit);
		}

		// int fruitSize = fruits.length;
		System.out.println("fruits - for o/p--> ");
		for (int x = 0; x < fruits.length; x++) {// regular for
			System.out.println(fruits[x]);
		}

	}

}

// for and do are same but syntax is different
/*
 * where as do-while, first executes that we initialize>> then increments> then
 * check if the incremented value is satisfying the condition
 */
