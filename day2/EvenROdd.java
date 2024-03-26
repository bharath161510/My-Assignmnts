package week1.day2;

import java.util.Scanner;

public class EvenROdd {

	public static void main(String[] args) {
		System.out.println("Enter the required number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
				
		if (number % 2 == 0) {
			System.out.println("The given number is Even number");
		}
		else 
			System.out.println("The given number is odd number");
		
        scanner.close();

	}
}
