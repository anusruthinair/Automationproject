package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleipl {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Googleipl gi=new Googleipl();
		gi.launchBrowser();
		gi.login();
		String result=gi.getResult();
		System.out.println(result);
		gi.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://www.google.co.in/");
	}
	public String getResult() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("ipl");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.id("result-stats")).getText();
		return result;
	}
	public void closeBrowser()
	{
		driver.close();
	}

}


















