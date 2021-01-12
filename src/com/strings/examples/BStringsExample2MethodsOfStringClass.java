package com.strings.examples;

public class BStringsExample2MethodsOfStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String actualMsg = "Hello World";
		System.out.println("actual string message is: "+actualMsg);
		int actualMsgLength = actualMsg.length();
		System.out.println("actualMsg string length is: "+actualMsgLength);
		System.out.println("substring from actualMsg is: "+actualMsg.substring(6));//to split from specific index till the end(begin index method)
		System.out.println("substring from actualMsg is: "+actualMsg.substring(6, 8));//to split from specific index till another index(begin index and end index)
		System.out.println("printing character at index number :"+actualMsg.charAt(6));//to print specific char at index
*/
		//element.getText();--> selenium webdriver method to get/read text
		
		/*----->
		
		//-----String methods "equals" & "equalsIgnoreCase"-----//
		String x1 = "blue";
		String x2 = "red";
		String x3 = "grey";
		String y1 = "blue";
		String y2 = "bLuE";
		String y3 = "yellow";
		System.out.println("result of string method--> equals: "+x1.equals(y1));
		System.out.println("result of string method--> equals: "+x1.equals(y3));
		System.out.println("result of string method--> equalsIgnoreCase: "+x1.equalsIgnoreCase(y2));
		
		//-----String method "contains"-----//
		String s1 = "It is going to rain Tomorrow";
		System.out.println("result of string method--> contains: "+s1.contains("rain"));
		System.out.println("result of string method--> contains: "+s1.contains("going to rain Tomorrow"));
		System.out.println("result of string method--> contains: "+s1.contains("tomorrow"));
		
		if(s1.contains("Tomorrow")) {
			System.out.println("string found, result is pass");
		}
		else {
			System.out.println("string not found, result is fail");
		}
		
		//-----String methods "replace char" & "replace string" & "replaceAll" & "replaceFirst"
        String msg = "Hello World this is ram";
		
		String replacedMessageChar = msg.replace("o", "i");//to replace specific char use replace method
		System.out.println("replaced char output using replace method: "+replacedMessageChar);
		String replacedMessaegeWord = msg.replace("World", "There");
		System.out.println("replaced word output using replace method: "+replacedMessaegeWord);//to replace specific word
		
		<-----*/
		
		String r1 = "it was a very very very good movie";
		String r2 = "it was a nice nice nice day";
		String r3 = "it is summer, so it is hot, so i'm thirsty";
		System.out.println(r1.replaceFirst("very", "great"));
		System.out.println(r2.replace("nice", "beuatiful"));//replace, replaceAll works the same way
		System.out.println(r3.replaceAll("so", "and"));
		
		String e1 = "error found in the logs";
		
		System.out.println("result of string method--> startsWith: "+e1.startsWith("error"));
		System.out.println("result of string method--> startsWith: "+e1.startsWith("exception"));
		System.out.println("result of string method--> startsWith at specific index: "+e1.startsWith("found", 6));
		System.out.println("result of string method--> startsWith at specific index:: "+e1.startsWith("found", 12));
		
		if (e1.startsWith("error")) {
			System.out.println("There is some error, please troubleshoot");
		}
		else {
			System.out.println("this step is success, plese proceed");
		}
		
	}

}
