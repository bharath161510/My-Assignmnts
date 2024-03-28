package week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNoArraywithIndex {

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
		int Largenumber = arr[0];
		int largeNoindex = 0;
		for (int i=0; i<arr.length; i++) {
			if(Largenumber<arr[i]) {
				
				Largenumber=arr[i];
				largeNoindex=i;
			}
		}
		System.out.println("Largest number : " +Largenumber);
		System.out.println("Largest number index : " +largeNoindex);

		scanner.close();
	}

}
