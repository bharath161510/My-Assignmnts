package week2.day2;

import java.util.Scanner;

public class PrintEven1to100 {
	
// Printing even numbers from 1 to 150

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter the starting number ");
	int startingnumber = scanner.nextInt();
	
	System.out.println("please enter the ending number ");
	int endingnumber = scanner.nextInt();
	int number = startingnumber;

		while (number<=endingnumber) {
			if (number%2==0)
			System.out.println(number);
			number++;
	}
		scanner.close();
	}
}
