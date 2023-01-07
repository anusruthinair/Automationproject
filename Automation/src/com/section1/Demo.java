package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		String actualerror="Username or Password is invalid. Please try again.";
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
		String fontsize=error.getCssValue("font");
		System.out.println(fontsize);
		String expectederror=error.getText();
		if(actualerror.equals(expectederror))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
	}

}






