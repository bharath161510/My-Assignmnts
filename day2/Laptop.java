package week1.day2;

public class Laptop {
	
	public void onLaptop() {
		System.out.println("swith on Laptop using power button");
		System.out.println("give proper credentials and login");
	}
	
	public void hrLogin () {
		System.out.println("Go to browser & go to HR portal");
		System.out.println("click on Time in option at top right croner");
	}
public static void main(String[] args) {
		Laptop L1 = new Laptop(); 
		L1.onLaptop();
		L1.hrLogin();
}

}
