package week2.day1;


public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {10,20,30,40,50};
		
		//size of Array
		int length = number.length;
		System.out.println(length);
	
		
// Iterate values from munber
//Array index always starts from 0, so we should use i=0
//we have given i less than number.length as it should not exceed than that.
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		//to reverse the array values 
		for (int i = number.length-1; i>=0 ; i--) {
			System.out.println(number[i]);
		}
	}

}
