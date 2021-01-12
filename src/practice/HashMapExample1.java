package practice;

import java.util.HashMap;

public class HashMapExample1 {
	public static void main(String[] args) {

		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		hmap1.put("a", 33);
		hmap1.put("b", 44);
		hmap1.put("c", 55);
		System.out.println("key/value pairs of hmap1 are: " + hmap1);
		System.out.println("value of key 'b' is: " + hmap1.get("b"));

		HashMap<String, String> capitals = new HashMap<String, String>();
		capitals.put("India", "Delhi");
		capitals.put("Paris", "France");
		capitals.put("Italy", "Rome");
		capitals.put("USA", "DC");
		capitals.put("Qatar", null);
		capitals.put("Spain", "Madrid");
		
		System.out.println("country/capitalCity pairs of capitals are: " + capitals);
		System.out.println("size of the HashMap capitals is: " + capitals.size());
		System.out.println("check if HaspMap contains key & return true/false: " + capitals.containsKey("India"));
		System.out.println("check equality with other HashMap & return true/false: " +capitals.equals(hmap1));
		System.out.println("If the specified key is not already associated with a value : " +capitals.putIfAbsent("Qatar", "Doha"));
		System.out.println("updated country/capitalCity pairs of capitals are: " + capitals);
				
		System.out.println("iterate using for & to print just keys use keySet: ");
		for (String i : capitals.keySet()) {
			System.out.println(i);
		}
		System.out.println("iterate using for & to print just values use values: ");
		for (String i : capitals.values()) {
			System.out.println(i);
		}
		System.out.println("iterate using for & to print both keys & values: ");
		for (String i : capitals.keySet()) {
			System.out.println("key: " + i + " value: " + capitals.get(i));
			
		}

	}

}
