package week2.day2;

import java.util.Scanner;

public class WeekdayWeekendSwitch {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(" pls enter the day name");
		 String dayName = scanner.next();
		 
	
		switch (dayName) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("uff, it's a weekday");
		break;
		case "Saturday":
		case "Sunday":
			System.err.println("yayy, it's a weekend");
		break;

		default:
			System.err.print("Invalid Day");
		}
		scanner.close();
	}

}
