package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowpopup {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
	WebElement Flights=driver.findElement(By.xpath("//a[text()='Flights']"));
	Actions act=new Actions(driver);
	act.moveToElement(Flights).perform();
	driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
	String mainId=driver.getWindowHandle();
	Set<String> allid=driver.getWindowHandles();
	for(String id:allid)
	{
		if(!(mainId.equals(id)))
		{
			driver.switchTo().window(id);
		}
	}
	String price=driver.findElement(By.className("CEmiEU")).getText();
	System.out.println(price);
	driver.close();
	}
}












