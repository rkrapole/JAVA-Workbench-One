package com.strings.examples;

public class DStringExample4StringBufferAndStringBuilder {
/*STRING -> string is immutable, means you cannot modify a String object once you created

/*STRINGBUFFER -> difference between String and StringBuffer is, String is immutable while StringBuffer is mutable means,
  you can modify a StringBuffer object once you created it without creating any new object */

/*STRINGBUILDER -> String is immutable whereas StringBuffer and StringBuider are mutable classes. StringBuffer
 is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than 
 StringBuffer. String concat + operator internally uses StringBuffer or StringBuilder class */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////string buffer
			
		String firstName1 = new String("ramakrishna");
		firstName1.concat(" rapole");//this doesn't update since string is immutable
		System.out.println("updated first name1 is: " +firstName1);
		
		StringBuffer firstName = new StringBuffer("ramakrishna");//you cannot create StringBuffer & StringBuilder variables without creating an object
		firstName.append(" rapole");//here we are using append string method
		System.out.println("updated first name is: "+firstName);
		
		StringBuilder lastName = new StringBuilder("rapole");
		lastName.append(" saanvi");//here we are using append string method
		System.out.println("full name from stringBuilder: "+lastName);
		
		

	}

}
