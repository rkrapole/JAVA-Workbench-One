package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCompareUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.add("mike");
		list1.add("john");
		list1.add("rey");
		list1.add("rex");
		
		list2.add("rex");
		list2.add("john");
		list2.add("mike");
		list2.add("rey");
		//list2.add("xy");
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		int l1size=list1.size();
		int l2size = list2.size();
		
		if(l1size == l2size) {
			
			for (int i = 0; i < l1size; i++) {
				//System.out.println("list1 item at "+i+" is:"+list1.get(i));
				//System.out.println("list2 item at "+i+" is:"+list2.get(i));
				list1.get(i).equals(list2.get(i));
				
			}
			System.out.println("lists are matching");
		} else {
			System.out.println("list1 is not matching list2");
		}
				
		
		
	
		
		

	}

}
