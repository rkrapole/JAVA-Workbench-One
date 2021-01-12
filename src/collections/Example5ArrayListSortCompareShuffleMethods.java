package collections;

import java.util.ArrayList;
import java.util.Collections;
public class Example5ArrayListSortCompareShuffleMethods {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.add("ab");
		list1.add("cd");
		list1.add("de");
		list1.add("bc");
		list2.add("de");
		list2.add("bc");
		list2.add("cd");
		list2.add("ab");
		
		System.out.println("before sorting list1 --> "+list1);
		System.out.println("before sorting list1 --> "+list2);
		
		Collections.sort(list1);
		System.out.println("after sorting list1 --> "+list1);
		Collections.sort(list2);
		System.out.println("after sorting list1 --> "+list2);
		
		System.out.println("compare list1 & list2 and return the result: "+list1.equals(list2));
		
		list2.add("ef");
		System.out.println("list2 after update --> "+list2);
		System.out.println("compare list1 & list2 after update, and return the result: "+list1.equals(list2));
		
		Collections.shuffle(list2);
		System.out.println("list2 after shuffule --> "+list2);
	}
}
