package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartprice {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String productname="APPLE iPhone X (Silver, 256 GB)";
		Flipkartprice fp=new Flipkartprice();
		fp.launchBrowser();
		fp.login();
		String price=fp.fetchPrice(productname);
		System.out.println(price);
		fp.closeBrowser();
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
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}

	public String fetchPrice(String productname) throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("iphonex");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath
				("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
	}
	public void closeBrowser()
	{
		driver.close();
	}
}








