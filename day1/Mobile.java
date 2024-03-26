package week1.day1;

public class Mobile {
	    
	    
	public void makeCall() {
		String mobileModel="samsung";
		float mobileWeight = 145;
		
		System.out.println("make a call in"+"  "+mobileModel+" "+"which has a weight of "+" "+mobileWeight);
	}
	
	public void sendMsg() {
		boolean fullyCharged = true;
		short mobileCost = 20000;
		
		System.out.println("Mobile cost is"+"  "+ mobileCost+" & it is fully charged:"+" "+fullyCharged);
	}
	
public static void main(String[] args) {
	Mobile myMobile = new Mobile();
	myMobile.makeCall();
	myMobile.sendMsg();
	System.out.println("This is my mobile");
}
	}
	
	

