package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		String object ="test";
		//System.out.println(object);
		object ="Leaf";
		
		System.out.println(object);
	//Diff bw .equal & == (double equql)
	// a=b
	//==  --- to comapre memory adress 
	// .equal to compare content of the string
		String text1 ="tstleaf";
		String text2 ="tstleaf";
		if(text1 ==text2) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("not equal");
		}

		
	}

}


