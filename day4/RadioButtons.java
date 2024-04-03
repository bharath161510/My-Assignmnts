package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class RadioButtons {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();	
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("(//label[text()='Safari']/preceding::div[1])[2]")).isEnabled();
		
		System.out.println(	driver.findElement(By.xpath("(//label[text()='Safari']/preceding::div[1])[2]")).isEnabled());
		
	}

}

