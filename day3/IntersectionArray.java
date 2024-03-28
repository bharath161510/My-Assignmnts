package week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionArray {

	public static void main(String[] args) {
//for input Array1
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter array1 size");
		int arr1size = scanner.nextInt();
		
		String[] arr1 = new String[arr1size];
		
		System.out.println(" pls enter array1 values");
		for (int i=0; i<arr1size; i++) {
			arr1 [i] = scanner.next();
		}

//for input Array2

	System.out.println("pls enter array2 size");
	int arr2size = scanner.nextInt();
	
	String[] arr2 = new String[arr2size];
	
	System.out.println(" pls enter array2 values");
	for (int i=0; i<arr2size; i++) {
		arr2 [i] = scanner.next();
	}
System.out.println("Input 1:"+Arrays.toString(arr1));

System.out.println("Input 2:"+Arrays.toString(arr2));

// atual Logic
	
//crating size of arr3 i.e arr1+arr2

	String arr3 [] =new String[arr1.length+arr2.length];
//copying arr1 to arr3
	
	for(int i=0; i<arr1.length;i++) {
		arr3[i] = arr1[i];
	}
//copying arr2 to arr3, from where to start copying and not to override
	
	for(int i=0; i<arr2.length;i++) {
		arr3[i+arr1.length] = arr2[i];
	}



	System.out.println("Output :"+Arrays.toString(arr3));
		
		scanner.close();
	}

}
