package week2.day2;

import java.util.Scanner;

public class ArrithmeticOpsSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter the 1st number");
		int number1 = scanner.nextInt();
		System.out.println("pls enter the 1st number");
		int number2 = scanner.nextInt();
		System.out.println("pls enter the operator");
		String operation = scanner.next();
		
		int result = 0;
		
		switch (operation) {
		case "+" :
			result = number1 + number2;
			break;
		case "-" :
			result = number1 - number2;
			break;
		case "*" :
			result = number1 * number2;
			break;
		case "/" :
			result = number1 / number2;
			break;
		case "%" :
			result = number1 % number2;
			break;

		default:
			System.err.println("Invalid Operator");
			break;

		}
		System.err.println(result);
		scanner.close();
	}

}
