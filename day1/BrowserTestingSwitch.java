package week2.day1;

public class BrowserTestingSwitch {
	public static void main(String[] args) {
		
	String browserName="IE";
	switch (browserName) {
	case "Chrome":
		System.out.println("Chrome browser execute successfully");
		break;
	case "Edge":
		System.out.println("Edge browser execute successfully");
		break;
	case "Firefox":
		System.out.println("Firefox browser execute successfully");
		break;
	case "Safari":
		System.out.println("Safari browser execute successfully");
		break;
	case "Opeara":
		System.out.println("Opeara browser execute successfully");
		break;

		
	default:
		System.err.println("This is a Default browser");
		break;
	}
	
	}

}
