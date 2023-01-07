package com.section2;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	WebElement allWebElements=driver.findElement(By.xpath("//*[@type='checkbox']"));
//	for( WebElement wb:allWebElements)
//	{
//		System.out.println(wb.getText());
//	}
//	System.out.println(allWebElements.size());
	}

}









