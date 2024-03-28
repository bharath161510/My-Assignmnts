package week2.day3.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
		//Launch chrome
		
		//ChromeDriver driver = new ChromeDriver();

		EdgeDriver  driver = new EdgeDriver();

		
		//To maximize broswer
		
		driver.manage().window().maximize();
		
		//Load appliation url
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");

		
		
	}

}
