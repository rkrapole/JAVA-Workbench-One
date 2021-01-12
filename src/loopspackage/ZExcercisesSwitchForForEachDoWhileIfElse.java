package loopspackage;

import java.util.Scanner;

public class ZExcercisesSwitchForForEachDoWhileIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String grade;
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter grade to find out the marks range: ");
		grade = key1.nextLine();
		
		///Switch Example////
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
		
		//for example///
		String[] cities = {"mumbai","newyork","london","paris","dubai"};
		int cityength = cities.length;
		//Scanner key = new Scanner(System.in);
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println("for loop output: "+cities[i]);
		}
		for (String city : cities) {
			System.out.println("for-each loop output: "+city);
		}
		if (cities[0].equals("mumbai")) {//--> Check on this
		System.out.println("country is India");
		}
		
		String news = "Newyork,stock,exchange,collapsed";
		String[] newsWord = news.split(",");
		int size = newsWord.length;
		
		for (int i = 0; i < newsWord.length; i++) {
			System.out.println(newsWord[i]);
			
		}
		
		

	}
		
}
