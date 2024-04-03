package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(driver.getTitle());
	   if(title.contains(title)) 
	   {
		   System.out.println("Title is matched");
	   }
	   else 
	   {
		   System.out.println("Title is not  matched");
	   }
	   	   
	   driver.navigate().to("https://leafground.com/button.xhtml");
	   Thread.sleep(1000);
	   
	   System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled());
	   
	   driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	   
	  Point location = driver.findElement(By.xpath("(//button[@type='button'])[3]")).getLocation();
	  
	  System.out.println("location: "+location);
	  	  
	  System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("colour"));
	  
	   System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));

	   WebElement element = driver.findElement(By.xpath("//span[text()='Submit']"));
	   Dimension dim = element.getSize();
	   System.out.println("dimension:"+dim);
	   
	   
	}

}