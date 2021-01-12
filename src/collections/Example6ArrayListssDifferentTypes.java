package collections;

import java.util.*;
import java.util.ArrayList;
import java.util.Vector;

public class Example6ArrayListssDifferentTypes {

	public static void main(String[] args) {
		/****-->below is how we declare different Array Lists<--****/
		//List al1 = new Vector();
		//List al1 = new ArrayList();
		List al1 = new LinkedList();
		//List al1 = new Stack();//-->** will not allow duplicate
		List al2 = new Stack();
		
		al1.add("mike");
		al1.add("sid");
		al1.add("ram");
		al1.add("sid");
		al1.add("roy");
		al1.add("roy");
		
		al2.add("mike");
		al2.add("sid");
		al2.add("ram");
		al2.add("sid");
		//al2.add("roy");
		System.out.println("arrayList objects from al1 are: "+al1);
		System.out.println("arrayList objects from al1 are: "+al2);
		
		//al1.clear();
		System.out.println("check al1 & al2 : "+al1.containsAll(al2));
		//System.out.println("Is the list empty : "+al1.contains("sid"));
		//System.out.println("Is the list empty : "+al1.isEmpty());
		//System.out.println("arrayList objects after clear are: "+al1);

	}

}
