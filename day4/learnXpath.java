package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnXpath {

	public static void main(String[] args) {

		//Launch chrome
				ChromeDriver driver = new ChromeDriver();
				
				
		//Maximize
		driver.manage().window().maximize();
				
		//Load link
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Enter the username as Demosalesmanager using Attribute based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa using Attribute based Xpath
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		//driver.findElement(By.xpath("//input[id='password")).sendKeys("crmsfa");
		
		//click on Login  button using Attribute based Xpath
		
		driver.findElement(By.className("decorativeSubmit")).click();

		//driver.findElement(By.xpath("//input[@type='submit'")).click();
		
		//To click on CRM/SFA
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		//click on leads tab
		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
		
		// click on create leads button
		driver.findElement(By.xpath("//a[(text()='Create Lead')]")).click();
		
		// Enter Company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Covalense Digital Services");
		
		//Enter 1st name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bharath");

		//Enter 2nd name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Naidu");

		//click submit
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
	}

}
