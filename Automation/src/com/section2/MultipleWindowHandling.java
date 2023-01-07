package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/iframe");
	//by using index
	//driver.switchTo().frame(0);
	
	//by using id or name attribute
	//driver.switchTo().frame("mce_0_ifr");
	
	//by using webelement
	WebElement frame1=driver.findElement(By.className("tox-edit-area__iframe"));
	driver.switchTo().frame(frame1);
	
	String msg=driver.findElement(By.tagName("p")).getText();
	System.out.println(msg);
	//changing driver focus to mainpage
	driver.switchTo().defaultContent();
	//click on format
	driver.findElement(By.xpath("//span[text()='Format']")).click();
	}
}

















