package week2.day2;

import java.util.Scanner;

public class EvenOddSwitch {

//if we can do any sort of comoarisions wheras in switch we can only do == comparisons.
// number%2 --- remainder 0 = Even 
	//number%--- remainder 1 = odd	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int remainder = number%2;
		
		switch (remainder) {
		case 0:
			System.out.println("Given number is Even");
		case 1:
			System.out.println("Given number is odd");
			break;
		}
		scanner.close();
	} 
	

}
