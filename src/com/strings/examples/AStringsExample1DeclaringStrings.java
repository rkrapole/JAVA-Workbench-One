package com.strings.examples;
//string, string buffer, string builder
public class AStringsExample1DeclaringStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String maleName = "ram";//here name variable is a literal and value is ram - this is stored in scp(string constant pool)
		String maleName2 = "ram";//-> here since string variable value is same, so it will be stored in scp only once, both maleName & maleName2 will fetch the same
		String femaleName = new String("Saanvi");//here we are creating an object of string class - this will be stored in heap
		String femaleName2 = new String("Saanvi");//-> since here we are creating new sting object with the same value, so it will be stored again in heap
		
		System.out.println(maleName);
		//System.out.println(maleName.hashCode());//gets the location of the stored value from scp
		System.out.println(femaleName);
		//System.out.println(femaleName.hashCode());
		System.out.println(maleName2);
		//System.out.println(maleName2.hashCode());
		System.out.println(femaleName2);
		//System.out.println(femaleName2.hashCode());
		

	}

}
