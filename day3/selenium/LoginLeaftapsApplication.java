package week2.day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftapsApplication {

	public static void main(String[] args) {

		//Launch chrome
		
		ChromeDriver driver = new ChromeDriver();
		
		//To maximize broswer
		
				driver.manage().window().maximize();
		//Load appliation url
				
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//click on Login  button'
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//print text
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//click on crmsfa hyper link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		// click on create leads button
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		// Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Covalense Digital Services");
		
		//Enter 1st name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");

		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandragiri");
		
		//Click on create Lead
		driver.findElement(By.name("submitButton")).click();
		
		
		
	}

}
