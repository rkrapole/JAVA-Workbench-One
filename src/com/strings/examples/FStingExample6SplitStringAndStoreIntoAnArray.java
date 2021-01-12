package com.strings.examples;

public class FStingExample6SplitStringAndStoreIntoAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello World this is ram";
		
		String replacedMessageChar = msg.replace("o", "i");//to replace specific char use replace method
		System.out.println("replaced char output using replace method: "+replacedMessageChar);
		
		String replacedMessaegeWord = msg.replace("World", "There");
		System.out.println("replaced word output using replace method: "+replacedMessaegeWord);//to replace specific word
		
		String[] words = msg.split(" ");//to split the words in a string, and stores each word in an array
		int size = words.length;
		for (int i = 0; i < words.length; i++) {//this is using for
			System.out.println("printing words of the array using for: "+words[i]);
		}
		for (String word : words) {//this is using for each
			System.out.println("printing words of the array using for-each: "+word);
		}

	}

}
