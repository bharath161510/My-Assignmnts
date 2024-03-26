package week2.day1;

public class LearnContiue {

	public static void main(String[] args) {
//pseudocode
		//for loop it will iterate upto 1 to 7
		//In between we have to write 5 in numbers
		//Inside for loop, we should give if condition
		//use continue to to to  loop again
		//again give a command to execute
		// Continue -- To skip current execution and it will help to execute next iteration
	
		for (int i = 1; i<=7; i++) {
			if (i==5) {
			System.out.println("Five");
			continue;
			}
			System.out.println(i);

		}
			
	}

}
