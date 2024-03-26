package week2.day1;

import java.util.Arrays;

public class SecondLargeNoArray {

	public static void main(String[] args) {

		int[] num = {1,8,3,5,0,7,9};
	//we have to sort arrays usingArray.sort()
		
		Arrays.sort(num); //0,1,3,5,7.8,9
		
		//System.out.println(num[num.length-2]); -- this can alos be used
	
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(num[num.length-2]);
		
	}

}
