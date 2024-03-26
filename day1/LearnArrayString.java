package week2.day1;

public class LearnArrayString {

	public static void main(String[] args) {
		String[] name = new String[6];
		name [0] ="Raghu";
		name [1] = "Bharath";
		name [2] = "Pooja";
		name [3] = "Devi";
		name [4] = "Siri";
		name [5] = "ravi";

		
		//i,5 -- index are 0,1,2,3,4
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
