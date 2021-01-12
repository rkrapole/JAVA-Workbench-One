package collections;

import java.awt.List;
import java.util.ArrayList;

public class Example3ConvertingPrimDataTypeToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		Integer a = Integer.valueOf(m);//this converts primitive type to object
		System.out.println("converting int to object: "+a);
		
		/*below example: if you need a arraList with specific/one type of objects, then you need a wrapper class, 
		below we used <Integer> wrapper class */
		ArrayList<Integer> al1 = new ArrayList<Integer>();//holds objects, here <Integer> is wrapper class
		ArrayList<Integer> alx = new ArrayList<Integer>();
		alx.add(25);
		alx.add(10);
		alx.add(2);
		alx.add(3);
		alx.add(10);
		///////////
		al1.add(a);
		al1.add(2);
		al1.add(3);
		al1.add(10);
		al1.add(0, 25);//adds int to specified index
		al1.add(7);
		al1.add(3);
		System.out.println("arrayList al1 objects are --> "+al1);
		System.out.println("gets int from specified index: "+al1.get(1));//gets int from specified index
		System.out.println("returns the hash code value for the list: "+al1.hashCode());
		System.out.println("returns index of the first occurrence of the specified elementin :"+al1.indexOf(10));
		System.out.println("checks equality with another list, based on size & objects then retruns True only if both matches :"+al1.equals(alx));
		System.out.println("removes obect at the specified index: "+al1.remove(2));
		System.out.println("updates the element value at a given index: "+al1.set(0, 8));
		System.out.println("return size - total number of elements in the list: "+al1.size());
		System.out.println("check if specified obj is present and returns true, otherwise false: "+al1.contains(10));
		System.out.println("arrayList al1 objects are --> "+al1);
				
		/*below example: if you need a arraList with multiple type of objects, then you dont need a wrapper class*/
		ArrayList al2 = new ArrayList();
		al2.add(11);
		al2.add("rk");
		al2.add(3.5);
		al2.add('s');
		System.out.println("arrayList al2 objects are --> "+al2);
		al2.set(2, 5.3);
		System.out.println("arrayList al2 objects after update are --> "+al2);
		
		
		

		
		
		
		

		
		
	}

}
