package week1.day1;

public class Reportcard {

	public static void main(String[] args) {

		Student myStudent = new Student();
		myStudent.StudentName = "Bharath";
		myStudent.collegeName ="SVCET";
		myStudent.cgpa = 8.6;
		myStudent.markScored = 860;
		
		System.out.println( myStudent.StudentName+" studied in "+myStudent.collegeName+" "
				+ " & passed out with marks and cgpa of "+myStudent.markScored +" & "+
				myStudent.cgpa);
		
	}

}
