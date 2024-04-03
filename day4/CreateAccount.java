package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();

		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Selenium Automation Test Engin");
		
		//Drop down select statement
		WebElement ele1 = driver.findElement(By.name("industryEnumId"));
		Select dd1=new Select(ele1);
		dd1.selectByIndex(2);
		
		WebElement ele2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(ele2);
		dd2.selectByVisibleText("S-Corporation");
		
		WebElement ele3 = driver.findElement(By.name("dataSourceId"));
		Select dd3 = new Select(ele3);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ele4 =driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select(ele4);
		dd4.selectByIndex(5);
		
		WebElement ele5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select(ele5);
		dd5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		//driver.close();
		
	}
}
