package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4ArrayListWithForForEachWhile {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(9);
		list1.add(7.5);
		list1.add("name");
		list1.add('k');
		list1.add(7777);

		System.out.println("object of the arrayList list1 are: " + list1);

		System.out.println("print using for loop --> ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(" " + list1.get(i));
		}
		System.out.println("\nprint using for-each loop --> ");
		for (Object objs : list1) {
			System.out.print(" " + objs);
		}

		System.out.println("\nprint using Iterator --> ");
		Iterator ir1 = list1.iterator();
		while (ir1.hasNext()) {
			Object objx = (Object) ir1.next();
			System.out.print(" " + objx);

		}

	}

}
