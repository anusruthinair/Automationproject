package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
	Actions act=new Actions(driver);
	act.moveToElement(jobs).perform();
	driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
	driver.findElement(By.linkText("Java Developer")).click();
	String mainId=driver.getWindowHandle();
	Set<String> allId=driver.getWindowHandles();
	for(String id:allId)
	{
		if(!(mainId.equals(id)))
		{
			driver.switchTo().window(id);
		}
	}
	String msg=driver.findElement
			(By.xpath("//h2[text()='Jobs you might be interested in']")).getText();
	System.out.println(msg);
	driver.close();
	driver.switchTo().window(mainId);
	System.out.println(driver.getTitle());
	}
}






















