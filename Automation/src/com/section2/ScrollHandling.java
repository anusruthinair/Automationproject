package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('username').value='admin';");
	jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
	jse.executeScript("document.getElementById('loginButton').click();");
	
	
	}

}










