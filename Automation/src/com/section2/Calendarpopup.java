package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpopup {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	String month=driver.findElement(By.className("ui-datepicker-month")).getText();
	String year=driver.findElement(By.className("ui-datepicker-year")).getText();
	while(!(month.equals("December") && year.equals("2009")))
	{
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		month=driver.findElement(By.className("ui-datepicker-month")).getText();
		year=driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	driver.findElement(By.linkText("31")).click();
}
}










