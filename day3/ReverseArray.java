package week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
//for input
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter array size");
		int arrsize = scanner.nextInt();
		
		boolean[] arr = new boolean[arrsize];
		
		System.out.println(" pls enter array values");
		for (int i=0; i<arrsize; i++) {
			arr [i] = scanner.nextBoolean();
		}
	System.out.println("Input:"+Arrays.toString(arr));
// atual Logic
		
	boolean[] revArr = new boolean[arr.length];
	
		for (int i=0; i<arr.length;i++) {
			revArr [arr.length-i-1] = arr[i];
		}
		
		System.out.println("output:"+Arrays.toString(revArr));
		
		scanner.close();
	}

}
