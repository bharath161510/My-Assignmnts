package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class EditLead {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();	
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.xpath("//a[(text()='Create Lead')]")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test123");	
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test123");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement ele1 = driver.findElement(By.name("industryEnumId"));
		Select dd1=new Select(ele1);
		dd1.selectByIndex(2);
		
		WebElement ele5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5 = new Select(ele5);
		dd5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Test123");
		
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("abcdfgh@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Welcome");

		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		//driver.close();

	}

}
