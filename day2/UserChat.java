package week1.day2;

import java.util.Scanner;

public class UserChat {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name");
		String Name = scanner.nextLine();
		System.out.printf("Hey %s, How are you?", Name);
		String Status = scanner.nextLine();
		if (Status == "Good") {
			System.out.println("Great, what is you age");
		}
		else {
		System.out.println("Good opurtunities are on the way, what is you age");
		}
		int age = scanner.nextInt();
		if (age>25) {
			System.out.println("Thanks for the information, our team will approach you");

		}
		else 
		System.out.println("Thanks, This program is only for people above 25");
		
        scanner.close();

	}

}
