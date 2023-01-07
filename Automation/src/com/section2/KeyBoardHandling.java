package com.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
//driver.findElement(By.id("username")).sendKeys
						//("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);


}
}