package practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListToSkipDuplicates {

	public static void main(String[] args) {
	/*TreeSet -> implements SortedSet Interface so that it will sort the elements entered
	and remove the duplicates*/
		SortedSet s1 = new TreeSet();
		
		s1.add("ab");
		s1.add("yz");
		s1.add("cd");
		s1.add("ab");
		s1.add("de");
		s1.add("xy");
		s1.add("ef");
		s1.add("xy");
		System.out.println("s1 objects are: "+s1);

	}

}
