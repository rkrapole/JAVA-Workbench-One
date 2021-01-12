package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "ram", name2 = "raj", name3 = "sid", name4 = "tej";
		String[] ar1 = { "ram", "raj", "sid", "tej" };

		int ar1Size = ar1.length;
		System.out.println("array ar1 size is : " + ar1Size);
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("o/p of array --> " + ar1[i]);

		}

		System.out.println("/////////////////////////////////////////////////////////");
		ArrayList<String> arList = new ArrayList<String>();// list - group of objects

		arList.add("ram");
		arList.add("raj");
		arList.add("sid");
		arList.add("tej");

		Iterator itr1 = arList.iterator();// it allows us to traverse thru iterator

		while (itr1.hasNext()) {// hasNext returns boolean and goes to next
			Object name = (Object) itr1.next();// reads the next objects
			System.out.println("o/p of ArrayList --> "+name);
		}

	}

}
