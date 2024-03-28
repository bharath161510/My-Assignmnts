package week2.day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Load link
		driver.get("https://www.facebook.com/");
		
		//Enter username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//click Login
		driver.findElement(By.name("login")).click();
		
		//Click on the ‘Find your account and log in
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//Get the title of the current web page.
		System.out.println("The title is: " + driver.getTitle());	
		
		//verify title
		if (driver.getTitle().contains("Forgotten Password")) {
			System.out.println("The title contains Forgotten Password");
		}
		else 
			System.out.println("The title doesn't contains Forgotten Password");
		
		//get current url
		System.out.println("The current url is: "+ driver.getCurrentUrl());
		
		//get page source
		//System.out.println("The page source is: "+driver.getPageSource());
		
		
		
	}

}
