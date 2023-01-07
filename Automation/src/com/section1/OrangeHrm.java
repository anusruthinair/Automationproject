package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/GANGA/Documents/seleniumbatch/registration.html");
	driver.findElement(By.xpath("//input[3]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[4]")).click();	
	}

}



