package week1.day2;

import java.util.Scanner;


public class GradingSystem {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Input student's marks
		
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();
        
        // Grading system
    
        String grade;
        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80 && marks < 90) {
            grade = "A";
        } else if (marks >= 70 && marks < 80) {
            grade = "B";
        } else if (marks >= 60 && marks < 70) {
            grade = "C";
        } else if (marks >= 50 && marks < 60) {
            grade = "D";
        } else if (marks >= 0 && marks < 50) {
            grade = "F";
        } else {
            grade = "Invalid marks";
        }
        
        // Display result
        System.out.println("Student's grade: " + grade);
        
        scanner.close();
		
	}

}
