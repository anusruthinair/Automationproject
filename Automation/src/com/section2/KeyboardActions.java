package com.section2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	WebElement search=driver.findElement(By.name("q"));
	Actions act=new Actions(driver);
	act.keyDown(Keys.SHIFT).sendKeys(search,"cricket").perform();
	act.keyUp(Keys.SHIFT).sendKeys(search,"cricket").perform();
	act.keyDown(Keys.CONTROL).sendKeys("a").perform();
}
}










