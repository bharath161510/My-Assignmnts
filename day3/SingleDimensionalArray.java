package week2.day3;


public class SingleDimensionalArray {

	public static void main(String[] args) {
// if we know values before creating array, we can write as below no need to create object.
// int j [] ={5,9,20,7,6}	
// j = new int[] {5,9,20,7,6}
		
		int j [] = new int[5];
		j[0] = 5;
		j[1] = 9;
		j[2] = 20;
		j[3] = 7;
		j[4] = 6;

		
		for (int i=0; i<j.length; i++)
			System.out.println(j[i]);
		
		 int sum = j[0] + j[1] + j[2] + j[3] + j[4];
		 System.out.println(sum);
		 
		 int i = 0;
		 while (i<j.length) {
			 System.out.println(j[i]);
		 	i++;
	}
	}

}
