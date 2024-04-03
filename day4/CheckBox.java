package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[(text()='Basic')]")).click();
		
		driver.findElement(By.xpath("//span[(text()='Ajax')]")).click();
		
		driver.findElement(By.xpath("//label[(text()='Java')]")).click();
		
		//try with preceding sibling
		
		driver.findElement(By.xpath("//label[text()='Python']/preceding::div[1]")).click();
		
		
		driver.findElement(By.xpath("//div[@class='card'][4]//div[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']")).click();
				
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();

		driver.findElement(By.xpath("(//label[text()='Miami']//preceding::div[1])[2]")).click();
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();

		//paris  -- //Label[text()='Paris']/preceding::div[1]
		
		//driver.findElement(By.xpath("//Label[text()='Paris']/preceding::div[1]")).click();
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();

		
	}

}
