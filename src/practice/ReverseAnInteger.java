package practice;

import java.util.Scanner;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int intNum,reversedIntNum;
		Scanner key = new Scanner(System.in);
		System.out.println("enter the integer number: ");
		intNum = key.nextInt();
		
		String intString = Integer.toString(intNum);//converted int to string
		String intReversedStr = "";
		
		char[] intStringCharArray = intString.toCharArray();//converted string to char array
		
		for (int i = intStringCharArray.length-1; i >= 0 ; i--) {
			intReversedStr = intReversedStr+intStringCharArray[i];//reversed srting
		}
		//System.out.println(intReversedStr);
		reversedIntNum = Integer.parseInt(intReversedStr);//converting reversed string to interger(reversedInt)
		System.out.println("revrsed Integer number is: "+reversedIntNum);
		
	}
}
