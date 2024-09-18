package week5.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParamTestNG {
	@Test
	@Parameters({"url","username","password"})
	public void runStaticParamTestNG(String url, String uname, String pass ) {

		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).click().perform();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		List<String> windowHandle = new ArrayList<String>(windowHandles);
//		
//		
//	for (String string : windowHandle) {
//		
//		System.out.println(string);
//	}
//		
	
	//	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Arun");

		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		driver.findElement(By.xpath("//div[@role='none']")).click();
		
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		
	//	WebElement element2 = driver.findElement(By.xpath("//span[@title='Active']"));
		
	//	action.moveToElement(element2).click().perform();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text = driver.findElement(By.xpath("//a[@href='javascript:void(0)' and @data-index='0']")).getText();
		
		//Alert alert = driver.switchTo().alert();
		
		//System.out.println(alert.getText());
		
		System.out.println(text);
		
		
		
		
	}

}
