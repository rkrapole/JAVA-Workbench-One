package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(7);
		al.add("rk");
		al.add('x');
		al.add(3.5);
		al.add(44.55);
		System.out.println("arrayList al objects are: "+al);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println("o/p using iterator --> "+obj);
			
		}
		

	}

}
