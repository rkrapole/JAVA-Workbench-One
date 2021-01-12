package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example7LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll1 = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>();
		
		
		ll1.add("rk");
		ll1.add("raj");
		ll1.add("sid");
		ll1.add("kevin");
		ll1.addFirst("rapole");//these doesn't exist in ArrayList
		ll1.addLast("xyz");
		System.out.println("linked list objects are: "+ll1);
		//ll2= ll1.clone();
		System.out.println("ll2 is: "+ll2);

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("rk");
		al1.add("raj");
		al1.add("sid");
		al1.add("kevin");
		al1.add(0, "rapole");
		al1.add(5, "xyz");
		System.out.println("array list objects are: "+al1);
		
	}

}
