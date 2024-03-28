package week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class AvgOfNoArray {

	public static void main(String[] args) {
//for input
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter array size");
		int arrsize = scanner.nextInt();
		
		int[] arr = new int[arrsize];
		
		System.out.println(" pls enter array values");
		for (int i=0; i<arrsize; i++) {
			arr [i] = scanner.nextInt();
		}
	System.out.println("Input:"+Arrays.toString(arr));
// atual Logic
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("output:"+sum/arr.length);
		
		scanner.close();
	}

}
