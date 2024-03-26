package week2.day2;

import java.util.Scanner;

public class WeedayWeekend {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the day name");
		String dayName=scanner.next();
		if(dayName.equals("Monday") ||
			dayName.equals("Tuesday") ||
			dayName.equals("Wednesday") ||
			dayName.equals("Thursday") ||
			dayName.equals("Friday"))
			System.out.println("uff, it's a weeday");
		else if (dayName.equals("saturday") ||
				dayName.equals("Sunday"))
			System.out.println("yayy it's a weekend");
		scanner.close();
	}

}
