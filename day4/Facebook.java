package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();	
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("GPBYS");
		
		driver.findElement(By.name("lastname")).sendKeys("PB");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9876543256");
		
		
		driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("XCV@1234");
		
		WebElement eledate = driver.findElement(By.id("day"));
			Select dd1 = new Select(eledate);
			dd1.selectByValue("30");
			
		
		WebElement elemonth = driver.findElement(By.id("month"));
			Select mm2 = new Select(elemonth);
			mm2.selectByIndex(6);
			
		WebElement eleyear = driver.findElement(By.id("year"));
			Select yy2 = new Select(eleyear);
			yy2.selectByValue("2000");
			
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

			
	}

}
