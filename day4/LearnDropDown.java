package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDropDown {

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
		
		//select method by value
		WebElement ele  = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sc=new Select(ele);
		sc.selectByValue("LEAD_CONFERENCE");
		
		//select method by index
		WebElement ele1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sc1=new Select(ele1);
		sc1.selectByIndex(2);
	
		//select method by VisibleText
		WebElement ele2=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sc2=new Select(ele2);
		sc2.selectByVisibleText("Computer Software");
		
		//Get the title of the current web page.
			System.out.println("The title is: " + driver.getTitle());	
				
		//verify title
				if (driver.getTitle().contains("Create Lead | opentaps CRM")) {
					System.out.println("The title is correct");
				}
				else 
					System.out.println("The title is incorrect");
				

		
	}

}
