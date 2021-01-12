package loopspackage;

import java.util.Scanner;

public class IConditionLoopsIfAndSwitchExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ------------->if-else program<----------------//
		int marks;
		Scanner key1 = new Scanner(System.in);
		System.out.println("enter marks");
		marks = key1.nextInt();

		if (marks < 40) {
			System.out.println("fail");
		} else if (marks >= 40 && marks <= 60) {
			System.out.println("grade C");
		} else if (marks > 60 && marks <= 80) {
			System.out.println("grade B");
		} else if (marks > 80 && marks <= 100) {
			System.out.println("grade A");
		} else {
			System.out.println("invalid input");
		}

		// ------------->switch program<----------------//
		System.out.println("enter month number");
		int monthNumber = key1.nextInt();

		switch (monthNumber) {
		case 1:
			System.out.println("Month 1: JAN");
			break;
		case 2:
			System.out.println("Month 2: FEB");
			break;
		case 3:
			System.out.println("Month 3: MAR");
			break;
		default:
			System.out.println("invalid input");
			break;
		}

		// ------------->switch program<----------------//
		System.out.println("enter month name");
		String monthName = key1.nextLine();

		switch (monthName) {
		case "JAN":
			System.out.println("Month 1");
			break;
		case "FEB":
			System.out.println("Month 2");
			break;
		case "MAR":
			System.out.println("Month 3");
			break;
		default:
			System.out.println("invalid input");
			break;
		}

		// ------------->switch program<----------------//
		int day;
		System.out.println("enter day");
		day = key1.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}
		// ------------->if-else program<----------------//
		int weekday;
		System.out.println("enter weekday");
		weekday = key1.nextInt();

		if (weekday == 1) {
			System.out.println("weekday 1 is Monday");
		} else if (weekday == 2) {
			System.out.println("weekday 2 is Tuesday");
		} else if (weekday == 3) {
			System.out.println("weekday 3 is Wednesday"); 
		} else if (weekday == 4) {
			System.out.println("weekday 3 is Thursday");
		} else if (weekday == 5) {
			System.out.println("weekday 4 is Friday");
		} else {
			System.out.println("invalid input");
		}
		
		// ------------->switch program<----------------//
		String grade;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter grade to find out the marks range: ");
		grade = key.nextLine();
		
		switch(grade) {
		case "A":
			System.out.println("marks > 80 && marks <= 100");
			break;
		case "B":
			System.out.println("marks > 60 && marks <= 80");
			break;
		case "C":
			System.out.println("marks >= 40 && marks <= 60");
			break;
		case "Fail":
			System.out.println("marks < 40");
			break;
		default:
			System.out.println("invalid input");
			break;
		}

	}

}
